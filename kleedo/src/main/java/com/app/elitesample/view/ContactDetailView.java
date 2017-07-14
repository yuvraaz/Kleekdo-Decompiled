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
import com.app.elitesample.delegates.ContactTabDelegates;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;

public class ContactDetailView
  extends HeaderContainer
  implements View.OnClickListener
{
  private ImageView bannerImg;
  private ContactTabDelegates contactTabDelegates;
  
  private void initUIView(View paramView)
  {
    this.contactTabDelegates = ((ContactTabDelegates)getParentFragment());
    initHeaderView(paramView);
    this.bannerImg = ((ImageView)paramView.findViewById(2131624078));
    setBannerImageView();
    this.editUserProfile.setVisibility(0);
    this.topBarTitleTxt.setVisibility(0);
    this.topBarTitleTxt.setText("Contact Details");
    this.editUserProfile.setOnClickListener(this);
  }
  
  private void setBannerImageView()
  {
    Picasso.with(getContext()).load("http://2.bp.blogspot.com/-MF62XeLcicM/UzBFjxytOCI/AAAAAAAAKkw/B-sgglRw4-w/s1600/Beautiful+Indian+Girls+Wallpapers+for+Desktop+Image+23.jpg").fit().centerCrop().placeholder(2130903040).error(2130903040).into(this.bannerImg);
  }
  
  public void onClick(View paramView)
  {
    if (paramView == this.editUserProfile) {
      this.contactTabDelegates.onEditClick();
    }
  }
  
  @Nullable
  public View onCreateView(LayoutInflater paramLayoutInflater, @Nullable ViewGroup paramViewGroup, @Nullable Bundle paramBundle)
  {
    return paramLayoutInflater.inflate(2130968615, paramViewGroup, false);
  }
  
  public void onViewCreated(View paramView, @Nullable Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    initUIView(paramView);
  }
}


/* Location:              D:\dex2jar-2.0\classes-dex2jar.jar!\com\app\elitesample\view\ContactDetailView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */