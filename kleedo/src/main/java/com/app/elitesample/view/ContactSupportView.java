package com.app.elitesample.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

public class ContactSupportView
  extends HeaderContainer
  implements View.OnClickListener
{
  private void initUIView(View paramView)
  {
    initHeaderView(paramView);
    this.topBarTitleTxt.setVisibility(0);
    this.topBarTitleTxt.setText("Contact Support");
    this.backBtn.setOnClickListener(this);
  }
  
  public void onClick(View paramView)
  {
    if (paramView == this.backBtn) {
      getActivity().onBackPressed();
    }
  }
  
  @Nullable
  public View onCreateView(LayoutInflater paramLayoutInflater, @Nullable ViewGroup paramViewGroup, @Nullable Bundle paramBundle)
  {
    return paramLayoutInflater.inflate(2130968618, paramViewGroup, false);
  }
  
  public void onViewCreated(View paramView, @Nullable Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    initUIView(paramView);
  }
}


/* Location:              D:\dex2jar-2.0\classes-dex2jar.jar!\com\app\elitesample\view\ContactSupportView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */