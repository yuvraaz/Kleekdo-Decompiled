package com.app.elitesample.adapters;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.List;

public class StoreTabCurrentBAdapter
  extends RecyclerView.Adapter<ViewHolder>
{
  private Context mContext;
  private View.OnClickListener onViewExpandListener = new View.OnClickListener()
  {
    public void onClick(View paramAnonymousView) {}
  };
  private List storeDataList;
  
  public StoreTabCurrentBAdapter(Context paramContext, List paramList)
  {
    this.storeDataList = paramList;
    this.mContext = paramContext;
  }
  
  public int getItemCount()
  {
    return this.storeDataList.size();
  }
  
  public void onBindViewHolder(ViewHolder paramViewHolder, int paramInt)
  {
    if (this.storeDataList.get(paramInt).equals("B"))
    {
      paramViewHolder.currentTotalBalance.setTextColor(ContextCompat.getColor(this.mContext, 2131492939));
      paramViewHolder.userFindType.setText("Purchase Made");
      paramViewHolder.plusOrImnusImg.setImageDrawable(ContextCompat.getDrawable(this.mContext, 2130837681));
    }
    for (;;)
    {
      paramViewHolder.clickToExpandView.setOnClickListener(this.onViewExpandListener);
      return;
      paramViewHolder.currentTotalBalance.setTextColor(ContextCompat.getColor(this.mContext, 2131492913));
      paramViewHolder.userFindType.setText("Funds Added");
      paramViewHolder.plusOrImnusImg.setImageDrawable(ContextCompat.getDrawable(this.mContext, 2130837703));
    }
  }
  
  public ViewHolder onCreateViewHolder(ViewGroup paramViewGroup, int paramInt)
  {
    return new ViewHolder(LayoutInflater.from(paramViewGroup.getContext()).inflate(2130968619, paramViewGroup, false));
  }
  
  public static class ViewHolder
    extends RecyclerView.ViewHolder
  {
    public LinearLayout clickToExpandView;
    public TextView currentTotalBalance;
    public ImageView plusOrImnusImg;
    public TextView transactionID;
    public TextView userFindType;
    
    public ViewHolder(View paramView)
    {
      super();
      this.plusOrImnusImg = ((ImageView)paramView.findViewById(2131624091));
      this.userFindType = ((TextView)paramView.findViewById(2131624092));
      this.currentTotalBalance = ((TextView)paramView.findViewById(2131624093));
      this.transactionID = ((TextView)paramView.findViewById(2131624094));
      this.clickToExpandView = ((LinearLayout)paramView.findViewById(2131624095));
    }
  }
}


/* Location:              D:\dex2jar-2.0\classes-dex2jar.jar!\com\app\elitesample\adapters\StoreTabCurrentBAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */