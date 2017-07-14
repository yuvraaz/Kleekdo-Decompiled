package com.app.elitesample.utils;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.os.Build.VERSION;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.widget.ImageView.ScaleType;
import com.app.elitesample.R.styleable;

public class CircularButton
  extends AppCompatImageView
{
  private static float SHADOW_CONSTANT = 0.15F;
  private int btnRadius;
  private int buttonColor = -1;
  private float centerX;
  private float centerY;
  private Paint mButtonPaint;
  private int shadowColor = -7829368;
  
  public CircularButton(Context paramContext)
  {
    super(paramContext);
    init(paramContext, null);
  }
  
  public CircularButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init(paramContext, paramAttributeSet);
  }
  
  public CircularButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init(paramContext, paramAttributeSet);
  }
  
  @TargetApi(11)
  private void init(Context paramContext, AttributeSet paramAttributeSet)
  {
    setScaleType(ImageView.ScaleType.CENTER_INSIDE);
    if (Build.VERSION.SDK_INT >= 11) {
      setLayerType(1, null);
    }
    this.mButtonPaint = new Paint(1);
    this.mButtonPaint.setStyle(Paint.Style.FILL);
    if (paramAttributeSet != null)
    {
      paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.CircularButton);
      this.buttonColor = paramContext.getColor(1, this.buttonColor);
      this.shadowColor = paramContext.getColor(0, this.shadowColor);
      paramContext.recycle();
    }
    setButtonColor(this.buttonColor);
  }
  
  public int getButtonColor()
  {
    return this.buttonColor;
  }
  
  public int getShadowColor()
  {
    return this.shadowColor;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    paramCanvas.drawCircle(this.centerX, this.centerY, this.btnRadius - this.btnRadius * SHADOW_CONSTANT, this.mButtonPaint);
    super.onDraw(paramCanvas);
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    this.centerX = (paramInt1 / 2);
    this.centerY = (paramInt2 / 2);
    this.btnRadius = (Math.min(paramInt1, paramInt2) / 2);
    setShadowColor(this.shadowColor);
  }
  
  public void setButtonColor(int paramInt)
  {
    this.buttonColor = paramInt;
    this.mButtonPaint.setColor(this.buttonColor);
    invalidate();
  }
  
  public void setShadowColor(int paramInt)
  {
    this.shadowColor = paramInt;
    this.mButtonPaint.setShadowLayer(this.btnRadius * SHADOW_CONSTANT, 0.0F, 0.0F, this.shadowColor);
    invalidate();
  }
}


/* Location:              D:\dex2jar-2.0\classes-dex2jar.jar!\com\app\elitesample\utils\CircularButton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */