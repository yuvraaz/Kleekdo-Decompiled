package com.app.elitesample.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.app.elitesample.delegates.LoginCallbackListener;

public class FingerPrintView
  extends Fragment
  implements View.OnClickListener
{
  private LoginCallbackListener loginCallbackListener;
  private ImageView userFingerPrintClick;
  
  private void initUIView(View paramView)
  {
    this.userFingerPrintClick = ((ImageView)paramView.findViewById(2131624127));
    this.userFingerPrintClick.setOnClickListener(this);
  }
  
  public void onClick(View paramView)
  {
    if (paramView == this.userFingerPrintClick) {
      this.loginCallbackListener.homeTabView();
    }
  }
  
  @Nullable
  public View onCreateView(LayoutInflater paramLayoutInflater, @Nullable ViewGroup paramViewGroup, @Nullable Bundle paramBundle)
  {
    return paramLayoutInflater.inflate(2130968638, paramViewGroup, false);
  }
  
  public void onViewCreated(View paramView, @Nullable Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    this.loginCallbackListener = ((LoginCallbackListener)getActivity());
    initUIView(paramView);
  }
}


/* Location:              D:\dex2jar-2.0\classes-dex2jar.jar!\com\app\elitesample\view\FingerPrintView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */