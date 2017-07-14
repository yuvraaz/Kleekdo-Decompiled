package com.app.elitesample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import com.app.elitesample.delegates.RegistrationDelegates;
import com.app.elitesample.view.AlmostDoneView;
import com.app.elitesample.view.JoinUsView;

public class RegistrationActivity
  extends AbstractBaseActivity
  implements RegistrationDelegates, View.OnClickListener
{
  private LinearLayout registerHere;
  
  private void initUIView()
  {
    this.registerHere = ((LinearLayout)findViewById(2131624146));
    this.registerHere.setOnClickListener(this);
    setFragmentView(2131624198, new JoinUsView(), false);
  }
  
  public void almostDone()
  {
    setFragmentView(2131624198, new AlmostDoneView(), true);
  }
  
  protected int getLayoutView()
  {
    return 2130968670;
  }
  
  public void onClick(View paramView)
  {
    onBackPressed();
  }
  
  protected void onCreate(@Nullable Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    initUIView();
  }
}


/* Location:              D:\dex2jar-2.0\classes-dex2jar.jar!\com\app\elitesample\RegistrationActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */