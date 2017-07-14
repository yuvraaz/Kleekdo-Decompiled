package com.app.elitesample.adapters;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ListView;
import android.widget.SectionIndexer;

public class SideSelector
  extends View
{
  public static char[] ALPHABET = { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90 };
  public static final int BOTTOM_PADDING = 10;
  private static String TAG = SideSelector.class.getCanonicalName();
  private ListView list;
  private Paint paint;
  private String[] sections;
  private SectionIndexer selectionIndexer = null;
  
  public SideSelector(Context paramContext)
  {
    super(paramContext);
    init();
  }
  
  public SideSelector(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }
  
  public SideSelector(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init();
  }
  
  private int getPaddedHeight()
  {
    return getHeight() - 10;
  }
  
  private void init()
  {
    setBackgroundColor(1157627903);
    this.paint = new Paint();
    this.paint.setColor(-16777216);
    this.paint.setTextSize(20.0F);
    this.paint.setTextAlign(Paint.Align.CENTER);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    float f1 = getPaddedHeight() / this.sections.length;
    float f2 = getMeasuredWidth() / 2;
    int i = 0;
    while (i < this.sections.length)
    {
      paramCanvas.drawText(String.valueOf(this.sections[i]), f2, i * f1 + f1, this.paint);
      i += 1;
    }
    super.onDraw(paramCanvas);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    super.onTouchEvent(paramMotionEvent);
    float f1 = (int)paramMotionEvent.getY() / getPaddedHeight();
    float f2 = ALPHABET.length;
    int i;
    if ((paramMotionEvent.getAction() == 0) || (paramMotionEvent.getAction() == 2))
    {
      if (this.selectionIndexer == null) {
        this.selectionIndexer = ((SectionIndexer)this.list.getAdapter());
      }
      i = this.selectionIndexer.getPositionForSection((int)(f1 * f2));
      if (i != -1) {}
    }
    else
    {
      return true;
    }
    this.list.setSelection(i);
    return true;
  }
  
  public void setListView(ListView paramListView)
  {
    this.list = paramListView;
    this.selectionIndexer = ((SectionIndexer)paramListView.getAdapter());
    paramListView = this.selectionIndexer.getSections();
    this.sections = new String[paramListView.length];
    int i = 0;
    while (i < paramListView.length)
    {
      this.sections[i] = paramListView[i].toString();
      i += 1;
    }
  }
}


/* Location:              D:\dex2jar-2.0\classes-dex2jar.jar!\com\app\elitesample\adapters\SideSelector.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */