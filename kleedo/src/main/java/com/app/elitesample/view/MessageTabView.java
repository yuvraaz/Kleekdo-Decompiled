package com.app.elitesample.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.app.elitesample.delegates.MessageTabDelegates;

public class MessageTabView
  extends BaseContainerFragment
  implements MessageTabDelegates
{
  private void initUIView(View paramView)
  {
    setFragmentView(2131624216, new MessageTabRecyclerView(), false);
  }
  
  @Nullable
  public View onCreateView(LayoutInflater paramLayoutInflater, @Nullable ViewGroup paramViewGroup, @Nullable Bundle paramBundle)
  {
    return paramLayoutInflater.inflate(2130968683, paramViewGroup, false);
  }
  
  public void onUserClick(Object paramObject)
  {
    setFragmentView(2131624216, new ChatScreenView(), true);
  }
  
  public void onViewCreated(View paramView, @Nullable Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    initUIView(paramView);
  }
}


/* Location:              D:\dex2jar-2.0\classes-dex2jar.jar!\com\app\elitesample\view\MessageTabView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */