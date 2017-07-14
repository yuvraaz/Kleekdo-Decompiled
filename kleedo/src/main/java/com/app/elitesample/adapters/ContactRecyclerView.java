package com.app.elitesample.adapters;

import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

public class ContactRecyclerView
  extends RecyclerView.Adapter<ViewHolder>
{
  private List contactList;
  
  public ContactRecyclerView(List paramList)
  {
    this.contactList = paramList;
  }
  
  public int getItemCount()
  {
    return this.contactList.size();
  }
  
  public void onBindViewHolder(ViewHolder paramViewHolder, int paramInt) {}
  
  public ViewHolder onCreateViewHolder(ViewGroup paramViewGroup, int paramInt)
  {
    return new ViewHolder(LayoutInflater.from(paramViewGroup.getContext()).inflate(2130968616, paramViewGroup, false));
  }
  
  public static class ViewHolder
    extends RecyclerView.ViewHolder
  {
    public ViewHolder(View paramView)
    {
      super();
    }
  }
}


/* Location:              D:\dex2jar-2.0\classes-dex2jar.jar!\com\app\elitesample\adapters\ContactRecyclerView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */