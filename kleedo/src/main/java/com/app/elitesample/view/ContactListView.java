package com.app.elitesample.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.app.elitesample.adapters.ContactRecyclerView;
import java.util.ArrayList;
import java.util.List;

public class ContactListView
  extends Fragment
{
  private List contactList;
  private ContactRecyclerView contactRecyclerView;
  private RecyclerView.LayoutManager mLayoutManager;
  private RecyclerView recyclerView;
  
  private void initUIView(View paramView)
  {
    this.recyclerView = ((RecyclerView)paramView.findViewById(2131624089));
    this.recyclerView.setHasFixedSize(true);
    this.mLayoutManager = new LinearLayoutManager(getActivity());
    this.recyclerView.setLayoutManager(this.mLayoutManager);
    this.contactList = new ArrayList(7);
    this.contactList.add("A");
    this.contactList.add("B");
    this.contactList.add("C");
    this.contactList.add("D");
    this.contactRecyclerView = new ContactRecyclerView(this.contactList);
    this.recyclerView.setAdapter(this.contactRecyclerView);
  }
  
  @Nullable
  public View onCreateView(LayoutInflater paramLayoutInflater, @Nullable ViewGroup paramViewGroup, @Nullable Bundle paramBundle)
  {
    return paramLayoutInflater.inflate(2130968617, paramViewGroup, false);
  }
  
  public void onViewCreated(View paramView, @Nullable Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    initUIView(paramView);
  }
}


/* Location:              D:\dex2jar-2.0\classes-dex2jar.jar!\com\app\elitesample\view\ContactListView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */