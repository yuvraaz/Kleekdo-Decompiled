package com.app.elitesample.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class DialerView
  extends Fragment
  implements View.OnClickListener
{
  private ImageView deleteDigit;
  private TextView dialertxt;
  private ImageView eight;
  private ImageView five;
  private ImageView four;
  private ImageView hashCode;
  private ImageView nine;
  private ImageView one;
  private ImageView seven;
  private ImageView six;
  private ImageView star;
  private ImageView three;
  private ImageView two;
  private ImageView zero;
  
  private void initUIView(View paramView)
  {
    this.dialertxt = ((TextView)paramView.findViewById(2131624112));
    this.one = ((ImageView)paramView.findViewById(2131624114));
    this.two = ((ImageView)paramView.findViewById(2131624115));
    this.three = ((ImageView)paramView.findViewById(2131624116));
    this.four = ((ImageView)paramView.findViewById(2131624117));
    this.five = ((ImageView)paramView.findViewById(2131624118));
    this.six = ((ImageView)paramView.findViewById(2131624119));
    this.seven = ((ImageView)paramView.findViewById(2131624120));
    this.eight = ((ImageView)paramView.findViewById(2131624121));
    this.nine = ((ImageView)paramView.findViewById(2131624122));
    this.star = ((ImageView)paramView.findViewById(2131624123));
    this.zero = ((ImageView)paramView.findViewById(2131624124));
    this.hashCode = ((ImageView)paramView.findViewById(2131624125));
    this.deleteDigit = ((ImageView)paramView.findViewById(2131624113));
    this.one.setOnClickListener(this);
    this.two.setOnClickListener(this);
    this.three.setOnClickListener(this);
    this.four.setOnClickListener(this);
    this.five.setOnClickListener(this);
    this.six.setOnClickListener(this);
    this.seven.setOnClickListener(this);
    this.eight.setOnClickListener(this);
    this.nine.setOnClickListener(this);
    this.zero.setOnClickListener(this);
    this.hashCode.setOnClickListener(this);
    this.star.setOnClickListener(this);
    this.deleteDigit.setOnClickListener(this);
  }
  
  public void onClick(View paramView)
  {
    String str = (String)this.dialertxt.getText();
    if (paramView == this.one)
    {
      paramView = str + "1";
      this.dialertxt.setText(paramView);
    }
    do
    {
      return;
      if (paramView == this.two)
      {
        paramView = str + "2";
        this.dialertxt.setText(paramView);
        return;
      }
      if (paramView == this.three)
      {
        paramView = str + "3";
        this.dialertxt.setText(paramView);
        return;
      }
      if (paramView == this.four)
      {
        paramView = str + "4";
        this.dialertxt.setText(paramView);
        return;
      }
      if (paramView == this.five)
      {
        paramView = str + "5";
        this.dialertxt.setText(paramView);
        return;
      }
      if (paramView == this.six)
      {
        paramView = str + "6";
        this.dialertxt.setText(paramView);
        return;
      }
      if (paramView == this.seven)
      {
        paramView = str + "7";
        this.dialertxt.setText(paramView);
        return;
      }
      if (paramView == this.eight)
      {
        paramView = str + "8";
        this.dialertxt.setText(paramView);
        return;
      }
      if (paramView == this.nine)
      {
        paramView = str + "9";
        this.dialertxt.setText(paramView);
        return;
      }
      if (paramView == this.zero)
      {
        paramView = str + "0";
        this.dialertxt.setText(paramView);
        return;
      }
      if (paramView == this.star)
      {
        paramView = str + "*";
        this.dialertxt.setText(paramView);
        return;
      }
      if (paramView == this.hashCode)
      {
        paramView = str + "#";
        this.dialertxt.setText(paramView);
        return;
      }
    } while ((paramView != this.deleteDigit) || (str.length() <= 0));
    str.length();
    paramView = str.substring(0, str.length() - 1);
    this.dialertxt.setText(paramView);
  }
  
  @Nullable
  public View onCreateView(LayoutInflater paramLayoutInflater, @Nullable ViewGroup paramViewGroup, @Nullable Bundle paramBundle)
  {
    return paramLayoutInflater.inflate(2130968635, paramViewGroup, false);
  }
  
  public void onViewCreated(View paramView, @Nullable Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    initUIView(paramView);
  }
}


/* Location:              D:\dex2jar-2.0\classes-dex2jar.jar!\com\app\elitesample\view\DialerView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */