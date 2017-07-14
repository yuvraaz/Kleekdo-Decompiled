package com.app.elitesample.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class CallTabView
  extends BaseContainerFragment
  implements View.OnClickListener
{
  private RelativeLayout callAnyOneId;
  private TextView callAnyOneSelected;
  private RelativeLayout recentCallId;
  private TextView recentCallSelected;
  private TextView topBarTitleTxt;
  
  private void initUIView(View paramView)
  {
    this.callAnyOneSelected = ((TextView)paramView.findViewById(2131624058));
    this.recentCallSelected = ((TextView)paramView.findViewById(2131624060));
    this.topBarTitleTxt = ((TextView)paramView.findViewById(2131624224));
    this.topBarTitleTxt.setText("Calls");
    this.topBarTitleTxt.setVisibility(0);
    this.recentCallId = ((RelativeLayout)paramView.findViewById(2131624059));
    this.callAnyOneId = ((RelativeLayout)paramView.findViewById(2131624057));
    this.recentCallId.setOnClickListener(this);
    this.callAnyOneId.setOnClickListener(this);
    callAnyOne();
  }
  
  public void callAnyOne()
  {
    this.recentCallSelected.setBackgroundColor(ContextCompat.getColor(getContext(), 2131492912));
    this.callAnyOneSelected.setBackgroundColor(ContextCompat.getColor(getContext(), 2131492892));
    setFragmentView(2131624061, new DialerView(), false);
  }
  
  public void onClick(View paramView)
  {
    if (paramView == this.callAnyOneId) {
      callAnyOne();
    }
    while (paramView != this.recentCallId) {
      return;
    }
    recentCall();
  }
  
  @Nullable
  public View onCreateView(LayoutInflater paramLayoutInflater, @Nullable ViewGroup paramViewGroup, @Nullable Bundle paramBundle)
  {
    return paramLayoutInflater.inflate(2130968608, paramViewGroup, false);
  }
  
  public void onViewCreated(View paramView, @Nullable Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    initUIView(paramView);
  }
  
  public void recentCall()
  {
    this.recentCallSelected.setBackgroundColor(ContextCompat.getColor(getContext(), 2131492892));
    this.callAnyOneSelected.setBackgroundColor(ContextCompat.getColor(getContext(), 2131492912));
    setFragmentView(2131624061, new RecentCallView(), false);
  }
}


/* Location:              D:\dex2jar-2.0\classes-dex2jar.jar!\com\app\elitesample\view\CallTabView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */