package com.app.elitesample.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.app.elitesample.adapters.StoredCardRecyclerViewAdapter;
import java.util.ArrayList;
import java.util.List;

public class StoredCardView
  extends Fragment
{
  private RecyclerView storedCardRecyclerView;
  private StoredCardRecyclerViewAdapter storedCardRecyclerViewAdapter;
  
  private void initUIView(View paramView)
  {
    this.storedCardRecyclerView = ((RecyclerView)paramView.findViewById(2131624209));
    paramView = new ArrayList();
    paramView.add("A");
    paramView.add("B");
    paramView.add("C");
    paramView.add("D");
    paramView.add("E");
    paramView.add("F");
    paramView.add("G");
    paramView.add("H");
    paramView.add("H");
    paramView.add("H");
    this.storedCardRecyclerView.setHasFixedSize(true);
    LinearLayoutManager localLinearLayoutManager = new LinearLayoutManager(getActivity());
    this.storedCardRecyclerView.setLayoutManager(localLinearLayoutManager);
    this.storedCardRecyclerViewAdapter = new StoredCardRecyclerViewAdapter(paramView);
    this.storedCardRecyclerView.setAdapter(this.storedCardRecyclerViewAdapter);
  }
  
  @Nullable
  public View onCreateView(LayoutInflater paramLayoutInflater, @Nullable ViewGroup paramViewGroup, @Nullable Bundle paramBundle)
  {
    return paramLayoutInflater.inflate(2130968680, paramViewGroup, false);
  }
  
  public void onViewCreated(View paramView, @Nullable Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    initUIView(paramView);
  }
}


/* Location:              D:\dex2jar-2.0\classes-dex2jar.jar!\com\app\elitesample\view\StoredCardView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */