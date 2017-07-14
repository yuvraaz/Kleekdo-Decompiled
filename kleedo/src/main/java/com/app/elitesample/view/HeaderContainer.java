package com.app.elitesample.view;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

public class HeaderContainer
  extends Fragment
{
  protected ImageButton backBtn;
  protected LinearLayout chatHeaderCall;
  protected LinearLayout chatHeaderName;
  protected ImageButton editUserProfile;
  protected ImageButton groupBtn;
  protected ImageButton moreBtn;
  protected ImageButton phoneCallBtn;
  protected TextView topBarTitleTxt;
  protected TextView userName;
  protected TextView userStatus;
  protected ImageButton videoCallBtn;
  
  public void initHeaderView(View paramView)
  {
    this.chatHeaderName = ((LinearLayout)paramView.findViewById(2131624222));
    this.chatHeaderCall = ((LinearLayout)paramView.findViewById(2131624226));
    this.userName = ((TextView)paramView.findViewById(2131624079));
    this.userStatus = ((TextView)paramView.findViewById(2131624223));
    this.topBarTitleTxt = ((TextView)paramView.findViewById(2131624224));
    this.groupBtn = ((ImageButton)paramView.findViewById(2131624227));
    this.videoCallBtn = ((ImageButton)paramView.findViewById(2131624228));
    this.phoneCallBtn = ((ImageButton)paramView.findViewById(2131624229));
    this.moreBtn = ((ImageButton)paramView.findViewById(2131624225));
    this.backBtn = ((ImageButton)paramView.findViewById(2131624221));
    this.editUserProfile = ((ImageButton)paramView.findViewById(2131624230));
  }
  
  public void setFragmentView(int paramInt, Fragment paramFragment, boolean paramBoolean)
  {
    FragmentTransaction localFragmentTransaction = getChildFragmentManager().beginTransaction();
    localFragmentTransaction.replace(paramInt, paramFragment);
    if (paramBoolean) {
      localFragmentTransaction.addToBackStack(paramFragment.getClass().getName());
    }
    localFragmentTransaction.commit();
  }
}
