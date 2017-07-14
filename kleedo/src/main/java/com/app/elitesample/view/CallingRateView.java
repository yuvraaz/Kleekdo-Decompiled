package com.app.elitesample.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import com.app.elitesample.adapters.CallingRateAdapter;
import com.app.elitesample.adapters.SideSelector;
import java.util.ArrayList;
import java.util.List;

public class CallingRateView
  extends HeaderContainer
  implements View.OnClickListener
{
  private void initUIView(View paramView)
  {
    int i = 0;
    initHeaderView(paramView);
    this.topBarTitleTxt.setVisibility(0);
    this.topBarTitleTxt.setText("Calling Rates");
    this.backBtn.setOnClickListener(this);
    ListView localListView = (ListView)paramView.findViewById(2131624062);
    ArrayList localArrayList = new ArrayList();
    char[] arrayOfChar = SideSelector.ALPHABET;
    int k = arrayOfChar.length;
    while (i < k)
    {
      char c = arrayOfChar[i];
      int j = 1;
      while (j <= 50)
      {
        localArrayList.add(String.valueOf(c) + "-" + j);
        j += 1;
      }
      i += 1;
    }
    localListView.setAdapter(new CallingRateAdapter(getContext(), 17367043, localArrayList));
    ((SideSelector)paramView.findViewById(2131624063)).setListView(localListView);
  }
  
  public void onClick(View paramView)
  {
    if (paramView == this.backBtn) {
      getActivity().onBackPressed();
    }
  }
  
  @Nullable
  public View onCreateView(LayoutInflater paramLayoutInflater, @Nullable ViewGroup paramViewGroup, @Nullable Bundle paramBundle)
  {
    return paramLayoutInflater.inflate(2130968610, paramViewGroup, false);
  }
  
  public void onViewCreated(View paramView, @Nullable Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    initUIView(paramView);
  }
}


/* Location:              D:\dex2jar-2.0\classes-dex2jar.jar!\com\app\elitesample\view\CallingRateView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */