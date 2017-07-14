package com.app.elitesample;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import com.app.elitesample.delegates.LoginCallbackListener;
import com.app.elitesample.view.FingerPrintView;
import com.app.elitesample.view.LoginView;
import com.app.elitesample.view.PasswordView;

public class LoginActivity
  extends AbstractBaseActivity
  implements View.OnClickListener, LoginCallbackListener
{
  private LinearLayout ifUanAccount;
  private LinearLayout registerHere;
  
  private void initUIView()
  {
    this.registerHere = ((LinearLayout)findViewById(2131624146));
    this.ifUanAccount = ((LinearLayout)findViewById(2131624147));
    this.registerHere.setOnClickListener(this);
    this.ifUanAccount.setOnClickListener(this);
  }
  
  private void loginView()
  {
    setFragmentView(2131624145, new LoginView(), false);
  }
  
  public void fingerPrintView()
  {
    setFragmentView(2131624145, new FingerPrintView(), true);
  }
  
  protected int getLayoutView()
  {
    return 2130968642;
  }
  
  public void homeTabView()
  {
    startActivity(new Intent(this, HomeBaseActivity.class));
  }
  
  public void onClick(View paramView)
  {
    if (paramView == this.registerHere) {
      startActivity(new Intent(this, RegistrationActivity.class));
    }
    while (paramView != this.ifUanAccount) {
      return;
    }
  }
  
  public void onCreate(@Nullable Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    initUIView();
    loginView();
  }
  
  public void pinCodeView()
  {
    setFragmentView(2131624145, new PasswordView(), true);
  }
}

