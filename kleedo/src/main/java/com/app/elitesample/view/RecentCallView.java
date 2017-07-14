package com.app.elitesample.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.app.elitesample.adapters.RecentCallRecyclerView;
import java.util.ArrayList;
import java.util.List;

public class RecentCallView
  extends Fragment
{
  private RecentCallRecyclerView recentCallAdapter;
  private RecyclerView recentCallRecyclerView;
  
  private void initUIView(View paramView)
  {
    this.recentCallRecyclerView = ((RecyclerView)paramView.findViewById(2131624196));
    paramView = new ArrayList();
    paramView.add("A");
    paramView.add("B");
    paramView.add("C");
    paramView.add("D");
    paramView.add("E");
    paramView.add("F");
    paramView.add("G");
    this.recentCallAdapter = new RecentCallRecyclerView(paramView);
    this.recentCallRecyclerView.setHasFixedSize(true);
    paramView = new LinearLayoutManager(getActivity());
    this.recentCallRecyclerView.setLayoutManager(paramView);
    this.recentCallRecyclerView.setAdapter(this.recentCallAdapter);
  }
  
  @Nullable
  public View onCreateView(LayoutInflater paramLayoutInflater, @Nullable ViewGroup paramViewGroup, @Nullable Bundle paramBundle)
  {
    return paramLayoutInflater.inflate(2130968668, paramViewGroup, false);
  }
  
  public void onViewCreated(View paramView, @Nullable Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    initUIView(paramView);
  }
}


/* Location:              D:\dex2jar-2.0\classes-dex2jar.jar!\com\app\elitesample\view\RecentCallView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */