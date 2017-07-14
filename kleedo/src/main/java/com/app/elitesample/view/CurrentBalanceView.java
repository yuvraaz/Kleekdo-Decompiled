package com.app.elitesample.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.app.elitesample.adapters.StoreTabCurrentBAdapter;
import java.util.ArrayList;
import java.util.List;

public class CurrentBalanceView
  extends Fragment
{
  private RecyclerView fundRecyclerView;
  private StoreTabCurrentBAdapter storeTabCurrentBAdapter;
  
  private void initUIView(View paramView)
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add("A");
    localArrayList.add("B");
    localArrayList.add("C");
    localArrayList.add("D");
    localArrayList.add("B");
    localArrayList.add("E");
    localArrayList.add("F");
    this.fundRecyclerView = ((RecyclerView)paramView.findViewById(2131624097));
    this.fundRecyclerView.setHasFixedSize(true);
    paramView = new LinearLayoutManager(getActivity());
    this.fundRecyclerView.setLayoutManager(paramView);
    this.storeTabCurrentBAdapter = new StoreTabCurrentBAdapter(getActivity(), localArrayList);
    this.fundRecyclerView.setAdapter(this.storeTabCurrentBAdapter);
  }
  
  @Nullable
  public View onCreateView(LayoutInflater paramLayoutInflater, @Nullable ViewGroup paramViewGroup, @Nullable Bundle paramBundle)
  {
    return paramLayoutInflater.inflate(2130968620, paramViewGroup, false);
  }
  
  public void onViewCreated(View paramView, @Nullable Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    initUIView(paramView);
  }
}


/* Location:              D:\dex2jar-2.0\classes-dex2jar.jar!\com\app\elitesample\view\CurrentBalanceView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */