package com.app.elitesample.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.app.elitesample.adapters.MessageRecyclerView;
import com.app.elitesample.delegates.MessageTabDelegates;
import java.util.ArrayList;
import java.util.List;

public class MessageTabRecyclerView
  extends HeaderContainer
{
  private List messageDataList;
  private RecyclerView messageRecyclerView;
  private MessageRecyclerView messageRecyclerViewAdapter;
  private MessageTabDelegates messageTabDelegates;
  
  private void initUIView(View paramView)
  {
    this.messageDataList = new ArrayList(5);
    this.messageDataList.add("A");
    this.messageDataList.add("B");
    this.messageDataList.add("C");
    this.messageDataList.add("D");
    this.messageDataList.add("E");
    this.messageRecyclerView = ((RecyclerView)paramView.findViewById(2131624151));
    this.messageRecyclerView.setHasFixedSize(true);
    paramView = new LinearLayoutManager(getActivity());
    this.messageRecyclerView.setLayoutManager(paramView);
    this.messageRecyclerViewAdapter = new MessageRecyclerView(this.messageDataList);
    this.messageRecyclerView.setAdapter(this.messageRecyclerViewAdapter);
    this.messageRecyclerViewAdapter.setUserChatListener(this.messageTabDelegates);
    this.topBarTitleTxt.setVisibility(0);
    this.topBarTitleTxt.setText("Messages");
  }
  
  @Nullable
  public View onCreateView(LayoutInflater paramLayoutInflater, @Nullable ViewGroup paramViewGroup, @Nullable Bundle paramBundle)
  {
    return paramLayoutInflater.inflate(2130968644, paramViewGroup, false);
  }
  
  public void onViewCreated(View paramView, @Nullable Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    this.messageTabDelegates = ((MessageTabDelegates)getParentFragment());
    initHeaderView(paramView);
    initUIView(paramView);
  }
}


/* Location:              D:\dex2jar-2.0\classes-dex2jar.jar!\com\app\elitesample\view\MessageTabRecyclerView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */