package com.app.elitesample.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.app.elitesample.delegates.ContactTabDelegates;

public class ContactsTabView
  extends BaseContainerFragment
  implements ContactTabDelegates
{
  private void initUIView()
  {
    setFragmentView(2131624216, new ContactDetailView(), false);
  }
  
  public void onContactInnerView()
  {
    setFragmentView(2131624216, new ContactDetailInnerView(), true);
  }
  
  public void onContactListClick() {}
  
  public void onContactView()
  {
    setFragmentView(2131624216, new ContactDetailView(), false);
  }
  
  @Nullable
  public View onCreateView(LayoutInflater paramLayoutInflater, @Nullable ViewGroup paramViewGroup, @Nullable Bundle paramBundle)
  {
    return paramLayoutInflater.inflate(2130968683, paramViewGroup, false);
  }
  
  public void onEditClick()
  {
    setFragmentView(2131624216, new EditUserProfileView(), true);
  }
  
  public void onViewCreated(View paramView, @Nullable Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    initUIView();
  }
}


/* Location:              D:\dex2jar-2.0\classes-dex2jar.jar!\com\app\elitesample\view\ContactsTabView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */