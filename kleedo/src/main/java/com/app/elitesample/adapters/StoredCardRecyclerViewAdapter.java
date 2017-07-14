package com.app.elitesample.adapters;

import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.mikhaellopez.circularimageview.CircularImageView;
import java.util.List;

public class StoredCardRecyclerViewAdapter
  extends RecyclerView.Adapter<RecyclerView.ViewHolder>
{
  private List userMessageList;
  
  public StoredCardRecyclerViewAdapter(List paramList)
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
    return new ViewHolder(LayoutInflater.from(paramViewGroup.getContext()).inflate(2130968679, paramViewGroup, false));
  }
  
  public static class ViewHolder
    extends RecyclerView.ViewHolder
  {
    public CircularImageView msgImg;
    
    public ViewHolder(View paramView)
    {
      super();
    }
  }
}


/* Location:              D:\dex2jar-2.0\classes-dex2jar.jar!\com\app\elitesample\adapters\StoredCardRecyclerViewAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */