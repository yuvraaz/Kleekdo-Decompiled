package com.app.elitesample;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost.TabSpec;
import android.widget.TextView;
import com.app.elitesample.view.BaseContainerFragment;
import com.app.elitesample.view.CallTabView;
import com.app.elitesample.view.ContactsTabView;
import com.app.elitesample.view.HomeTabView;
import com.app.elitesample.view.MessageTabView;
import com.app.elitesample.view.StoreTabView;

public class HomeBaseActivity
  extends AbstractBaseActivity
{
  private FragmentTabHost mTabHost;
  
  private View getTabIndicator(Context paramContext, int paramInt1, int paramInt2)
  {
    paramContext = LayoutInflater.from(paramContext).inflate(2130968684, null);
    ((ImageView)paramContext.findViewById(2131624217)).setImageResource(paramInt2);
    ((TextView)paramContext.findViewById(2131624218)).setText(paramInt1);
    return paramContext;
  }
  
  private void initUIView(Bundle paramBundle)
  {
    this.mTabHost = ((FragmentTabHost)findViewById(2131624053));
    this.mTabHost.setup(this, getSupportFragmentManager(), 2131624052);
    this.mTabHost.addTab(this.mTabHost.newTabSpec("Calls").setIndicator(getTabIndicator(this.mTabHost.getContext(), 2131165244, 2130837612)), CallTabView.class, paramBundle);
    this.mTabHost.addTab(this.mTabHost.newTabSpec("Messages").setIndicator(getTabIndicator(this.mTabHost.getContext(), 2131165245, 2130837621)), MessageTabView.class, paramBundle);
    this.mTabHost.addTab(this.mTabHost.newTabSpec("Contacts").setIndicator(getTabIndicator(this.mTabHost.getContext(), 2131165246, 2130837626)), ContactsTabView.class, paramBundle);
    this.mTabHost.addTab(this.mTabHost.newTabSpec("Store").setIndicator(getTabIndicator(this.mTabHost.getContext(), 2131165247, 2130837725)), StoreTabView.class, paramBundle);
    this.mTabHost.addTab(this.mTabHost.newTabSpec("Home").setIndicator(getTabIndicator(this.mTabHost.getContext(), 2131165248, 2130837653)), HomeTabView.class, paramBundle);
  }
  
  protected int getLayoutView()
  {
    return 2130968604;
  }
  
  public void onBackPressed()
  {
    boolean bool = false;
    String str = this.mTabHost.getCurrentTabTag();
    if (str.equals("Home")) {
      bool = ((BaseContainerFragment)getSupportFragmentManager().findFragmentByTag("Home")).popFragment();
    }
    for (;;)
    {
      if (!bool) {
        super.onBackPressed();
      }
      return;
      if (str.equals("Messages")) {
        bool = ((BaseContainerFragment)getSupportFragmentManager().findFragmentByTag("Messages")).popFragment();
      }
    }
  }
  
  protected void onCreate(@Nullable Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    initUIView(paramBundle);
  }
}


/* Location:              D:\dex2jar-2.0\classes-dex2jar.jar!\com\app\elitesample\HomeBaseActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */