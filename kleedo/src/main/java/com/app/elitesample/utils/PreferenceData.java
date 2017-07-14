package com.app.elitesample.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class PreferenceData
{
  private SharedPreferences prefs;
  
  public PreferenceData(Context paramContext)
  {
    this.prefs = paramContext.getSharedPreferences("com.app.elitesample", 0);
  }
  
  public boolean getSlideScreenIsViewable()
  {
    return this.prefs.getBoolean("slideViewSee", false);
  }
  
  public void setSlideScreenOneTime()
  {
    SharedPreferences.Editor localEditor = this.prefs.edit();
    localEditor.putBoolean("slideViewSee", true);
    localEditor.commit();
  }
}


/* Location:              D:\dex2jar-2.0\classes-dex2jar.jar!\com\app\elitesample\utils\PreferenceData.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */