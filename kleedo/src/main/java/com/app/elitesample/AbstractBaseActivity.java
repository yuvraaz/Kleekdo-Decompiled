package com.app.elitesample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

public abstract class AbstractBaseActivity
        extends AppCompatActivity {
    protected abstract int getLayoutView();

    protected void onCreate(@Nullable Bundle paramBundle) {
        super.onCreate(paramBundle);
        setContentView(getLayoutView());
    }

    public void setFragmentView(int paramInt, Fragment paramFragment, boolean paramBoolean) {
        FragmentTransaction localFragmentTransaction = getSupportFragmentManager().beginTransaction();
        localFragmentTransaction.replace(paramInt, paramFragment);
        if (paramBoolean) {
            localFragmentTransaction.addToBackStack(paramFragment.getClass().getName());
        }
        localFragmentTransaction.commit();
    }
}

