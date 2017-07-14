package com.app.elitesample.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.app.elitesample.delegates.RegistrationDelegates;

public class JoinUsView
  extends Fragment
  implements View.OnClickListener
{
  private ImageView registrationBtnView;
  private RegistrationDelegates registrationDelegates;
  
  private void initUIView(View paramView)
  {
    this.registrationBtnView = ((ImageView)paramView.findViewById(2131624144));
    this.registrationBtnView.setOnClickListener(this);
  }
  
  public void onClick(View paramView)
  {
    this.registrationDelegates.almostDone();
  }
  
  @Nullable
  public View onCreateView(LayoutInflater paramLayoutInflater, @Nullable ViewGroup paramViewGroup, @Nullable Bundle paramBundle)
  {
    return paramLayoutInflater.inflate(2130968640, paramViewGroup, false);
  }
  
  public void onViewCreated(View paramView, @Nullable Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    this.registrationDelegates = ((RegistrationDelegates)getActivity());
    initUIView(paramView);
  }
}


/* Location:              D:\dex2jar-2.0\classes-dex2jar.jar!\com\app\elitesample\view\JoinUsView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */