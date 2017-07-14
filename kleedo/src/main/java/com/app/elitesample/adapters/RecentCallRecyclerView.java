package com.app.elitesample.adapters;

import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.mikhaellopez.circularimageview.CircularImageView;
import java.util.List;

public class RecentCallRecyclerView
  extends RecyclerView.Adapter<ViewHolder>
{
  private View.OnClickListener onClickListener = new View.OnClickListener()
  {
    public void onClick(View paramAnonymousView) {}
  };
  private List userMessageList;
  
  public RecentCallRecyclerView(List paramList)
  {
    this.userMessageList = paramList;
  }
  
  public int getItemCount()
  {
    return this.userMessageList.size();
  }
  
  public void onBindViewHolder(ViewHolder paramViewHolder, int paramInt)
  {
    paramViewHolder.parentRow.setOnClickListener(this.onClickListener);
  }
  
  public ViewHolder onCreateViewHolder(ViewGroup paramViewGroup, int paramInt)
  {
    return new ViewHolder(LayoutInflater.from(paramViewGroup.getContext()).inflate(2130968667, paramViewGroup, false));
  }
  
  public static class ViewHolder
    extends RecyclerView.ViewHolder
  {
    public CircularImageView msgImg;
    public RelativeLayout parentRow;
    
    public ViewHolder(View paramView)
    {
      super();
      this.msgImg = ((CircularImageView)paramView.findViewById(2131624153));
      this.parentRow = ((RelativeLayout)paramView.findViewById(2131624152));
    }
  }
}


/* Location:              D:\dex2jar-2.0\classes-dex2jar.jar!\com\app\elitesample\adapters\RecentCallRecyclerView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */