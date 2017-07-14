package com.app.elitesample.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.app.elitesample.adapters.ChatRecyclerViewAdapter;
import java.util.ArrayList;
import java.util.List;

public class ChatScreenView
  extends HeaderContainer
  implements View.OnClickListener
{
  private RecyclerView chatRecyclerView;
  private ChatRecyclerViewAdapter chatRecyclerViewAdapter;
  
  private void chatHeaderView()
  {
    this.chatHeaderName.setVisibility(0);
    this.chatHeaderCall.setVisibility(0);
    this.groupBtn.setOnClickListener(this);
    this.videoCallBtn.setOnClickListener(this);
    this.phoneCallBtn.setOnClickListener(this);
    this.backBtn.setOnClickListener(this);
    this.moreBtn.setOnClickListener(this);
  }
  
  private void initUIView(View paramView)
  {
    initHeaderView(paramView);
    chatHeaderView();
    ArrayList localArrayList = new ArrayList(5);
    localArrayList.add("A");
    localArrayList.add("B");
    localArrayList.add("B");
    localArrayList.add("B");
    localArrayList.add("C");
    localArrayList.add("D");
    localArrayList.add("E");
    localArrayList.add("B");
    localArrayList.add("B");
    localArrayList.add("B");
    localArrayList.add("B");
    this.chatRecyclerView = ((RecyclerView)paramView.findViewById(2131624073));
    paramView = new LinearLayoutManager(getActivity());
    paramView.setStackFromEnd(true);
    paramView.setSmoothScrollbarEnabled(false);
    this.chatRecyclerView.setLayoutManager(paramView);
    this.chatRecyclerViewAdapter = new ChatRecyclerViewAdapter(localArrayList);
    this.chatRecyclerView.setAdapter(this.chatRecyclerViewAdapter);
  }
  
  public void onClick(View paramView)
  {
    if (paramView == this.videoCallBtn) {}
    do
    {
      do
      {
        return;
      } while ((paramView == this.phoneCallBtn) || (paramView == this.groupBtn));
      if (paramView == this.backBtn)
      {
        getActivity().onBackPressed();
        return;
      }
    } while (paramView != this.moreBtn);
  }
  
  @Nullable
  public View onCreateView(LayoutInflater paramLayoutInflater, @Nullable ViewGroup paramViewGroup, @Nullable Bundle paramBundle)
  {
    return paramLayoutInflater.inflate(2130968613, paramViewGroup, false);
  }
  
  public void onViewCreated(View paramView, @Nullable Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    initUIView(paramView);
  }
}


/* Location:              D:\dex2jar-2.0\classes-dex2jar.jar!\com\app\elitesample\view\ChatScreenView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */