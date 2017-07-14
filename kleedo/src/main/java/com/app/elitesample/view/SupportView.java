package com.app.elitesample.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.app.elitesample.ScreenSlidePagerActivity;
import com.app.elitesample.delegates.HomeTabDelegates;

public class SupportView
  extends HeaderContainer
  implements View.OnClickListener
{
  private LinearLayout aboutKleekdoView;
  private LinearLayout contactSupport;
  private LinearLayout helpFaqView;
  private HomeTabDelegates homeTabDelegates;
  private LinearLayout leaveFeedback;
  private LinearLayout quickTour;
  private LinearLayout termsOfServices;
  
  private void initUIView(View paramView)
  {
    initHeaderView(paramView);
    this.quickTour = ((LinearLayout)paramView.findViewById(2131624210));
    this.aboutKleekdoView = ((LinearLayout)paramView.findViewById(2131624211));
    this.contactSupport = ((LinearLayout)paramView.findViewById(2131624212));
    this.leaveFeedback = ((LinearLayout)paramView.findViewById(2131624213));
    this.helpFaqView = ((LinearLayout)paramView.findViewById(2131624214));
    this.termsOfServices = ((LinearLayout)paramView.findViewById(2131624215));
    this.topBarTitleTxt.setText("Support");
    this.topBarTitleTxt.setVisibility(0);
    this.backBtn.setOnClickListener(this);
    this.quickTour.setOnClickListener(this);
    this.aboutKleekdoView.setOnClickListener(this);
    this.contactSupport.setOnClickListener(this);
    this.leaveFeedback.setOnClickListener(this);
    this.helpFaqView.setOnClickListener(this);
    this.termsOfServices.setOnClickListener(this);
  }
  
  public void onClick(View paramView)
  {
    if (paramView == this.backBtn) {
      getActivity().onBackPressed();
    }
    do
    {
      return;
      if (paramView == this.quickTour)
      {
        paramView = new Intent(getContext(), ScreenSlidePagerActivity.class);
        paramView.putExtra("InnterTab", true);
        getActivity().startActivity(paramView);
        return;
      }
      if (paramView == this.aboutKleekdoView)
      {
        this.homeTabDelegates.aboutKleekdoView();
        return;
      }
      if (paramView == this.contactSupport)
      {
        this.homeTabDelegates.contactView();
        return;
      }
      if (paramView == this.leaveFeedback)
      {
        this.homeTabDelegates.leaveFeedbackView();
        return;
      }
      if (paramView == this.helpFaqView)
      {
        this.homeTabDelegates.helpFaqView();
        return;
      }
    } while (paramView != this.termsOfServices);
    this.homeTabDelegates.termOfServiceView();
  }
  
  @Nullable
  public View onCreateView(LayoutInflater paramLayoutInflater, @Nullable ViewGroup paramViewGroup, @Nullable Bundle paramBundle)
  {
    return paramLayoutInflater.inflate(2130968682, paramViewGroup, false);
  }
  
  public void onViewCreated(View paramView, @Nullable Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    this.homeTabDelegates = ((HomeTabDelegates)getParentFragment());
    initUIView(paramView);
  }
}


/* Location:              D:\dex2jar-2.0\classes-dex2jar.jar!\com\app\elitesample\view\SupportView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */