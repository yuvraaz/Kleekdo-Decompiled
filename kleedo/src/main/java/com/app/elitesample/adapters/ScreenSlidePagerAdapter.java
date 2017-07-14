package com.app.elitesample.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import com.app.elitesample.view.ScreenSlidePageFragment;

public class ScreenSlidePagerAdapter
  extends FragmentStatePagerAdapter
{
  private int NUM_PAGES;
  
  public ScreenSlidePagerAdapter(FragmentManager paramFragmentManager, int paramInt)
  {
    super(paramFragmentManager);
    this.NUM_PAGES = paramInt;
  }
  
  public int getCount()
  {
    return this.NUM_PAGES;
  }
  
  public Fragment getItem(int paramInt)
  {
    return ScreenSlidePageFragment.newInstance(paramInt);
  }
}


/* Location:              D:\dex2jar-2.0\classes-dex2jar.jar!\com\app\elitesample\adapters\ScreenSlidePagerAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */