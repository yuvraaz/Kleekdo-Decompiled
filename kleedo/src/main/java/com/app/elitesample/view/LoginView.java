package com.app.elitesample.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import com.app.elitesample.delegates.LoginCallbackListener;

public class LoginView
  extends Fragment
  implements View.OnClickListener
{
  private EditText confirmNumber;
  private ImageView loginBtn;
  private LoginCallbackListener loginCallbackListener;
  private EditText phoneNumber;
  
  private void initView(View paramView)
  {
    this.phoneNumber = ((EditText)paramView.findViewById(2131624148));
    this.phoneNumber = ((EditText)paramView.findViewById(2131624149));
    this.loginBtn = ((ImageView)paramView.findViewById(2131624150));
    this.loginBtn.setOnClickListener(this);
  }
  
  public void onClick(View paramView)
  {
    if (paramView == this.loginBtn) {
      this.loginCallbackListener.pinCodeView();
    }
  }
  
  @Nullable
  public View onCreateView(LayoutInflater paramLayoutInflater, @Nullable ViewGroup paramViewGroup, @Nullable Bundle paramBundle)
  {
    return paramLayoutInflater.inflate(2130968643, paramViewGroup, false);
  }
  
  public void onViewCreated(View paramView, @Nullable Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    this.loginCallbackListener = ((LoginCallbackListener)getActivity());
    initView(paramView);
  }
}


/* Location:              D:\dex2jar-2.0\classes-dex2jar.jar!\com\app\elitesample\view\LoginView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */