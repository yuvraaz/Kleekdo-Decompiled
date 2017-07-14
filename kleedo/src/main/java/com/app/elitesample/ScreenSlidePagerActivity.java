package com.app.elitesample;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import com.app.elitesample.adapters.ScreenSlidePagerAdapter;

public class ScreenSlidePagerActivity
  extends AbstractBaseActivity
{
  private boolean innterTab;
  private ScreenSlidePagerAdapter screenSlidePagerAdapter;
  private ViewPager viewPager;
  
  protected int getLayoutView()
  {
    return 2130968676;
  }
  
  protected void onCreate(@Nullable Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    paramBundle = getIntent().getExtras();
    if ((paramBundle != null) && (paramBundle.getBoolean("InnterTab"))) {
      this.innterTab = paramBundle.getBoolean("InnterTab");
    }
    this.viewPager = ((ViewPager)findViewById(2131624200));
    this.screenSlidePagerAdapter = new ScreenSlidePagerAdapter(getSupportFragmentManager(), 5);
    this.viewPager.setAdapter(this.screenSlidePagerAdapter);
    this.viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener()
    {
      public void onPageScrollStateChanged(int paramAnonymousInt) {}
      
      public void onPageScrolled(int paramAnonymousInt1, float paramAnonymousFloat, int paramAnonymousInt2) {}
      
      public void onPageSelected(int paramAnonymousInt)
      {
        if ((paramAnonymousInt == 4) && (!ScreenSlidePagerActivity.this.innterTab))
        {
          localIntent = new Intent(ScreenSlidePagerActivity.this, LoginActivity.class);
          ScreenSlidePagerActivity.this.startActivity(localIntent);
        }
        while (paramAnonymousInt != 4)
        {
          Intent localIntent;
          return;
        }
        ScreenSlidePagerActivity.this.finish();
      }
    });
  }
}


/* Location:              D:\dex2jar-2.0\classes-dex2jar.jar!\com\app\elitesample\ScreenSlidePagerActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */