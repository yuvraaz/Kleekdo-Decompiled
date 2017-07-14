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

public class StoreInnerTabView
  extends HeaderContainer
  implements View.OnClickListener
{
  private TextView borderColorCurrentBalance;
  private RelativeLayout currentBalanceView;
  private TextView storedCardColor;
  private RelativeLayout storedCardView;
  
  private void initUIView(View paramView)
  {
    initHeaderView(paramView);
    this.storedCardView = ((RelativeLayout)paramView.findViewById(2131624206));
    this.currentBalanceView = ((RelativeLayout)paramView.findViewById(2131624204));
    this.storedCardColor = ((TextView)paramView.findViewById(2131624207));
    this.borderColorCurrentBalance = ((TextView)paramView.findViewById(2131624205));
    this.storedCardView.setOnClickListener(this);
    this.currentBalanceView.setOnClickListener(this);
    this.topBarTitleTxt.setVisibility(0);
    this.topBarTitleTxt.setText("Wallet");
    selectStoredCard();
  }
  
  private void selectStoredCard()
  {
    this.storedCardColor.setBackgroundColor(ContextCompat.getColor(getContext(), 2131492912));
    this.borderColorCurrentBalance.setBackgroundColor(ContextCompat.getColor(getContext(), 2131492892));
    setFragmentView(2131624208, new CurrentBalanceView(), false);
  }
  
  public void onClick(View paramView)
  {
    if (paramView == this.storedCardView)
    {
      this.borderColorCurrentBalance.setBackgroundColor(ContextCompat.getColor(getContext(), 2131492912));
      this.storedCardColor.setBackgroundColor(ContextCompat.getColor(getContext(), 2131492892));
      setFragmentView(2131624208, new StoredCardView(), false);
    }
    while (paramView != this.currentBalanceView) {
      return;
    }
    selectStoredCard();
  }
  
  @Nullable
  public View onCreateView(LayoutInflater paramLayoutInflater, @Nullable ViewGroup paramViewGroup, @Nullable Bundle paramBundle)
  {
    return paramLayoutInflater.inflate(2130968678, paramViewGroup, false);
  }
  
  public void onViewCreated(View paramView, @Nullable Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    initUIView(paramView);
  }
}


/* Location:              D:\dex2jar-2.0\classes-dex2jar.jar!\com\app\elitesample\view\StoreInnerTabView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */