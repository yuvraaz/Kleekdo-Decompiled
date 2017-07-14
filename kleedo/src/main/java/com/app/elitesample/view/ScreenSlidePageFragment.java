package com.app.elitesample.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class ScreenSlidePageFragment
  extends Fragment
{
  private int position;
  private int[] resources = { 2130837700, 2130837735, 2130837732, 2130837647, 2130837646 };
  private ImageView screenView;
  
  private void initUIView(View paramView)
  {
    this.screenView = ((ImageView)paramView.findViewById(2131624199));
    this.screenView.setImageResource(this.resources[this.position]);
  }
  
  public static ScreenSlidePageFragment newInstance(int paramInt)
  {
    ScreenSlidePageFragment localScreenSlidePageFragment = new ScreenSlidePageFragment();
    localScreenSlidePageFragment.position = paramInt;
    return localScreenSlidePageFragment;
  }
  
  @Nullable
  public View onCreateView(LayoutInflater paramLayoutInflater, @Nullable ViewGroup paramViewGroup, @Nullable Bundle paramBundle)
  {
    return paramLayoutInflater.inflate(2130968675, paramViewGroup, false);
  }
  
  public void onViewCreated(View paramView, @Nullable Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    initUIView(paramView);
  }
}


/* Location:              D:\dex2jar-2.0\classes-dex2jar.jar!\com\app\elitesample\view\ScreenSlidePageFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */