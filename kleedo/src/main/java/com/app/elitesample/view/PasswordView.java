package com.app.elitesample.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.app.elitesample.delegates.LoginCallbackListener;

public class PasswordView
  extends Fragment
  implements View.OnClickListener
{
  private RelativeLayout eightBtn;
  private RelativeLayout fiveBtn;
  private RelativeLayout fourBtn;
  private LoginCallbackListener loginCallbackListener;
  private RelativeLayout nineBtn;
  private RelativeLayout oneBtn;
  private EditText pinCodeEdit;
  private RelativeLayout sevenBtn;
  private RelativeLayout sixBtn;
  private RelativeLayout threeBtn;
  private RelativeLayout twoBtn;
  private RelativeLayout zeroBtn;
  
  private void initUIView(View paramView)
  {
    this.pinCodeEdit = ((EditText)paramView.findViewById(2131624183));
    this.oneBtn = ((RelativeLayout)paramView.findViewById(2131624184));
    this.twoBtn = ((RelativeLayout)paramView.findViewById(2131624185));
    this.threeBtn = ((RelativeLayout)paramView.findViewById(2131624186));
    this.fourBtn = ((RelativeLayout)paramView.findViewById(2131624187));
    this.fiveBtn = ((RelativeLayout)paramView.findViewById(2131624188));
    this.sixBtn = ((RelativeLayout)paramView.findViewById(2131624189));
    this.sevenBtn = ((RelativeLayout)paramView.findViewById(2131624190));
    this.eightBtn = ((RelativeLayout)paramView.findViewById(2131624191));
    this.nineBtn = ((RelativeLayout)paramView.findViewById(2131624192));
    this.zeroBtn = ((RelativeLayout)paramView.findViewById(2131624193));
    this.oneBtn.setOnClickListener(this);
    this.twoBtn.setOnClickListener(this);
    this.threeBtn.setOnClickListener(this);
    this.fourBtn.setOnClickListener(this);
    this.fiveBtn.setOnClickListener(this);
    this.sixBtn.setOnClickListener(this);
    this.sevenBtn.setOnClickListener(this);
    this.eightBtn.setOnClickListener(this);
    this.nineBtn.setOnClickListener(this);
    this.zeroBtn.setOnClickListener(this);
  }
  
  public void onClick(View paramView)
  {
    if (paramView == this.oneBtn) {
      this.loginCallbackListener.fingerPrintView();
    }
    do
    {
      return;
      if (paramView == this.twoBtn)
      {
        this.loginCallbackListener.fingerPrintView();
        return;
      }
      if (paramView == this.threeBtn)
      {
        this.loginCallbackListener.fingerPrintView();
        return;
      }
      if (paramView == this.fourBtn)
      {
        this.loginCallbackListener.fingerPrintView();
        return;
      }
      if (paramView == this.fiveBtn)
      {
        this.loginCallbackListener.fingerPrintView();
        return;
      }
      if (paramView == this.sixBtn)
      {
        this.loginCallbackListener.fingerPrintView();
        return;
      }
      if (paramView == this.sevenBtn)
      {
        this.loginCallbackListener.fingerPrintView();
        return;
      }
      if (paramView == this.eightBtn)
      {
        this.loginCallbackListener.fingerPrintView();
        return;
      }
      if (paramView == this.nineBtn)
      {
        this.loginCallbackListener.fingerPrintView();
        return;
      }
    } while (paramView != this.zeroBtn);
    Toast.makeText(getActivity(), "Zero", 1).show();
    this.loginCallbackListener.fingerPrintView();
  }
  
  @Nullable
  public View onCreateView(LayoutInflater paramLayoutInflater, @Nullable ViewGroup paramViewGroup, @Nullable Bundle paramBundle)
  {
    return paramLayoutInflater.inflate(2130968664, paramViewGroup, false);
  }
  
  public void onViewCreated(View paramView, @Nullable Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    this.loginCallbackListener = ((LoginCallbackListener)getActivity());
    initUIView(paramView);
  }
}


/* Location:              D:\dex2jar-2.0\classes-dex2jar.jar!\com\app\elitesample\view\PasswordView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */