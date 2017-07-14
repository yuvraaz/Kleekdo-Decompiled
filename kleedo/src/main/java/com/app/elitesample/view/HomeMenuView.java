package com.app.elitesample.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.android.volley.Response.ErrorListener;
import com.android.volley.VolleyError;
import com.app.elitesample.delegates.HomeTabDelegates;
import com.app.elitesample.delegates.IResponseDelegate;
import com.app.elitesample.services.VolleyHelper;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;

public class HomeMenuView
  extends HeaderContainer
  implements View.OnClickListener, Response.ErrorListener, IResponseDelegate
{
  private String TAG = HomeMenuView.class.getName();
  private ImageButton billingView;
  private ImageButton displayCallerView;
  private ImageView editProfileBtn;
  private HomeTabDelegates homeTabDelegates;
  private ImageButton notificationView;
  private ImageButton referAFriendView;
  private ImageButton settingView;
  private ImageButton supportView;
  private ImageView userBannerImage;
  
  private void clickMethod() {}
  
  private void initUIView(View paramView)
  {
    this.billingView = ((ImageButton)paramView.findViewById(2131624131));
    this.referAFriendView = ((ImageButton)paramView.findViewById(2131624133));
    this.displayCallerView = ((ImageButton)paramView.findViewById(2131624135));
    this.settingView = ((ImageButton)paramView.findViewById(2131624137));
    this.notificationView = ((ImageButton)paramView.findViewById(2131624139));
    this.supportView = ((ImageButton)paramView.findViewById(2131624141));
    this.userBannerImage = ((ImageView)paramView.findViewById(2131624078));
    this.editProfileBtn = ((ImageView)paramView.findViewById(2131624129));
    this.topBarTitleTxt.setVisibility(0);
    this.topBarTitleTxt.setText("Home");
    this.billingView.setOnClickListener(this);
    this.referAFriendView.setOnClickListener(this);
    this.displayCallerView.setOnClickListener(this);
    this.settingView.setOnClickListener(this);
    this.notificationView.setOnClickListener(this);
    this.supportView.setOnClickListener(this);
    this.editProfileBtn.setOnClickListener(this);
    userBannerImg("https://www.wired.com/images_blogs/photos/uncategorized/2008/03/04/mattcutts555.jpg");
  }
  
  private void userBannerImg(String paramString)
  {
    Picasso.with(getActivity()).load(paramString).fit().centerCrop().placeholder(2130837665).error(2130837665).into(this.userBannerImage);
  }
  
  public void onClick(View paramView)
  {
    if (paramView == this.billingView) {
      this.homeTabDelegates.onBillingMethodView();
    }
    do
    {
      return;
      if (paramView == this.referAFriendView)
      {
        this.homeTabDelegates.onReferFriendView();
        return;
      }
      if (paramView == this.displayCallerView)
      {
        this.homeTabDelegates.onDisplayCallerView();
        return;
      }
      if (paramView == this.supportView)
      {
        this.homeTabDelegates.onSupportView();
        return;
      }
      if (paramView == this.notificationView)
      {
        this.homeTabDelegates.onNotificationView();
        return;
      }
      if (paramView == this.supportView)
      {
        this.homeTabDelegates.onSupportView();
        return;
      }
    } while (paramView != this.editProfileBtn);
    this.homeTabDelegates.editProfileView();
  }
  
  @Nullable
  public View onCreateView(LayoutInflater paramLayoutInflater, @Nullable ViewGroup paramViewGroup, @Nullable Bundle paramBundle)
  {
    return paramLayoutInflater.inflate(2130968639, paramViewGroup, false);
  }
  
  public void onErrorResponse(VolleyError paramVolleyError) {}
  
  public void onStop()
  {
    super.onStop();
    VolleyHelper.getInstance(getActivity()).cancelRequest(this.TAG);
  }
  
  public void onSuccess(Object paramObject, int paramInt)
  {
    Toast.makeText(getActivity(), "Response :", 1).show();
  }
  
  public void onViewCreated(View paramView, @Nullable Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    this.homeTabDelegates = ((HomeTabDelegates)getParentFragment());
    initHeaderView(paramView);
    initUIView(paramView);
  }
}


/* Location:              D:\dex2jar-2.0\classes-dex2jar.jar!\com\app\elitesample\view\HomeMenuView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */