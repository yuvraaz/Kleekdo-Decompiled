package com.app.elitesample.adapters;

import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.app.elitesample.utils.CircleImageView;
import java.util.List;

public class ChatRecyclerViewAdapter
  extends RecyclerView.Adapter<RecyclerView.ViewHolder>
{
  private final int MY_SELF = 0;
  private final int YOUR_SELF = 1;
  private List userMessageList;
  
  public ChatRecyclerViewAdapter(List paramList)
  {
    this.userMessageList = paramList;
  }
  
  public int getItemCount()
  {
    return this.userMessageList.size();
  }
  
  public int getItemViewType(int paramInt)
  {
    if (((String)this.userMessageList.get(paramInt)).equalsIgnoreCase("B")) {
      return 0;
    }
    return 1;
  }
  
  public void onBindViewHolder(RecyclerView.ViewHolder paramViewHolder, int paramInt)
  {
    switch (paramViewHolder.getItemViewType())
    {
    default: 
      return;
    case 0: 
      paramViewHolder = (ViewHolderLeft)paramViewHolder;
      paramViewHolder.msgImg.setImageDrawable(ContextCompat.getDrawable(paramViewHolder.msgImg.getContext(), 2130837699));
      return;
    }
    paramViewHolder = (ViewHolderRight)paramViewHolder;
    paramViewHolder.otherImg.setImageDrawable(ContextCompat.getDrawable(paramViewHolder.otherImg.getContext(), 2130837699));
  }
  
  public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup paramViewGroup, int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return null;
    case 0: 
      return new ViewHolderLeft(LayoutInflater.from(paramViewGroup.getContext()).inflate(2130968611, paramViewGroup, false));
    }
    return new ViewHolderRight(LayoutInflater.from(paramViewGroup.getContext()).inflate(2130968612, paramViewGroup, false));
  }
  
  public static class ViewHolderLeft
    extends RecyclerView.ViewHolder
  {
    public CircleImageView msgImg;
    
    public ViewHolderLeft(View paramView)
    {
      super();
      this.msgImg = ((CircleImageView)paramView.findViewById(2131624064));
    }
  }
  
  public static class ViewHolderRight
    extends RecyclerView.ViewHolder
  {
    public CircleImageView otherImg;
    
    public ViewHolderRight(View paramView)
    {
      super();
      this.otherImg = ((CircleImageView)paramView.findViewById(2131624069));
    }
  }
}


/* Location:              D:\dex2jar-2.0\classes-dex2jar.jar!\com\app\elitesample\adapters\ChatRecyclerViewAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */