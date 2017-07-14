package com.app.elitesample.adapters;

import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.List;

public class OfferListRecyclerAdapter
  extends RecyclerView.Adapter<RecyclerView.ViewHolder>
{
  private List userMessageList;
  
  public OfferListRecyclerAdapter(List paramList)
  {
    this.userMessageList = paramList;
  }
  
  public int getItemCount()
  {
    return this.userMessageList.size();
  }
  
  public void onBindViewHolder(RecyclerView.ViewHolder paramViewHolder, int paramInt) {}
  
  public ViewHolder onCreateViewHolder(ViewGroup paramViewGroup, int paramInt)
  {
    return new ViewHolder(LayoutInflater.from(paramViewGroup.getContext()).inflate(2130968662, paramViewGroup, false));
  }
  
  public static class ViewHolder
    extends RecyclerView.ViewHolder
  {
    public ImageView msgImg;
    
    public ViewHolder(View paramView)
    {
      super();
      this.msgImg = ((ImageView)paramView.findViewById(2131624180));
    }
  }
}


/* Location:              D:\dex2jar-2.0\classes-dex2jar.jar!\com\app\elitesample\adapters\OfferListRecyclerAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */