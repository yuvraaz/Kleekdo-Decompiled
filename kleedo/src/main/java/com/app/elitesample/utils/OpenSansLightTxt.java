package com.app.elitesample.utils;

import android.content.Context;
import android.graphics.Typeface;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

public class OpenSansLightTxt
  extends AppCompatTextView
{
  public OpenSansLightTxt(Context paramContext)
  {
    super(paramContext);
    init(paramContext);
  }
  
  public OpenSansLightTxt(Context paramContext, @Nullable AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init(paramContext);
  }
  
  public OpenSansLightTxt(Context paramContext, @Nullable AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init(paramContext);
  }
  
  public void init(Context paramContext)
  {
    setTypeface(Typeface.createFromAsset(paramContext.getAssets(), "OpenSans_Light.ttf"));
  }
}


/* Location:              D:\dex2jar-2.0\classes-dex2jar.jar!\com\app\elitesample\utils\OpenSansLightTxt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */