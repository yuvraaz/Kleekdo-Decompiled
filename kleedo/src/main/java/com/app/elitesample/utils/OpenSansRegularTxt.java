package com.app.elitesample.utils;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

public class OpenSansRegularTxt
  extends AppCompatTextView
{
  public OpenSansRegularTxt(Context paramContext)
  {
    super(paramContext);
    init(paramContext);
  }
  
  public OpenSansRegularTxt(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init(paramContext);
  }
  
  public OpenSansRegularTxt(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init(paramContext);
  }
  
  private void init(Context paramContext)
  {
    setTypeface(Typeface.createFromAsset(paramContext.getAssets(), "OpenSans_Regular.ttf"));
  }
}


/* Location:              D:\dex2jar-2.0\classes-dex2jar.jar!\com\app\elitesample\utils\OpenSansRegularTxt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */