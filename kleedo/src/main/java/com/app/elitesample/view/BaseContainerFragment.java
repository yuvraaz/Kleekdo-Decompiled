package com.app.elitesample.view;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

public class BaseContainerFragment
  extends Fragment
{
  public boolean popFragment()
  {
    boolean bool = false;
    if (getChildFragmentManager().getBackStackEntryCount() > 0)
    {
      bool = true;
      getChildFragmentManager().popBackStack();
    }
    return bool;
  }
  
  public void setFragmentView(int paramInt, Fragment paramFragment, boolean paramBoolean)
  {
    FragmentTransaction localFragmentTransaction = getChildFragmentManager().beginTransaction();
    localFragmentTransaction.replace(paramInt, paramFragment);
    if (paramBoolean) {
      localFragmentTransaction.addToBackStack(paramFragment.getClass().getName());
    }
    localFragmentTransaction.commit();
  }
}


/* Location:              D:\dex2jar-2.0\classes-dex2jar.jar!\com\app\elitesample\view\BaseContainerFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */