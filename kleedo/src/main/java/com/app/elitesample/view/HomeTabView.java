package com.app.elitesample.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.app.elitesample.delegates.HomeTabDelegates;

public class HomeTabView
  extends BaseContainerFragment
  implements HomeTabDelegates
{
  private void initUIView(View paramView)
  {
    setFragmentView(2131624216, new HomeMenuView(), false);
  }
  
  public void aboutKleekdoView()
  {
    setFragmentView(2131624216, new AboutView(), true);
  }
  
  public void contactView()
  {
    setFragmentView(2131624216, new ContactSupportView(), true);
  }
  
  public void editProfileView()
  {
    setFragmentView(2131624216, new EditUserProfileView(), true);
  }
  
  public void helpFaqView()
  {
    setFragmentView(2131624216, new HelpFaqView(), true);
  }
  
  public void leaveFeedbackView()
  {
    setFragmentView(2131624216, new FeedbackView(), true);
  }
  
  public void onBillingMethodView()
  {
    setFragmentView(2131624216, new BillingMethodView(), true);
  }
  
  @Nullable
  public View onCreateView(LayoutInflater paramLayoutInflater, @Nullable ViewGroup paramViewGroup, @Nullable Bundle paramBundle)
  {
    return paramLayoutInflater.inflate(2130968683, paramViewGroup, false);
  }
  
  public void onDisplayCallerView()
  {
    setFragmentView(2131624216, new CallingRateView(), true);
  }
  
  public void onNotificationView() {}
  
  public void onReferFriendView()
  {
    setFragmentView(2131624216, new ReferAFriendView(), true);
  }
  
  public void onSettingView() {}
  
  public void onSupportView()
  {
    setFragmentView(2131624216, new SupportView(), true);
  }
  
  public void onViewCreated(View paramView, @Nullable Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    initUIView(paramView);
  }
  
  public void quickTourView()
  {
    Toast.makeText(getActivity(), "Quick Tour under development", 1).show();
  }
  
  public void termOfServiceView()
  {
    setFragmentView(2131624216, new TermsOfServicesView(), true);
  }
}


/* Location:              D:\dex2jar-2.0\classes-dex2jar.jar!\com\app\elitesample\view\HomeTabView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */