package com.app.elitesample.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class BillingMethodView
        extends HeaderContainer
        implements View.OnClickListener {
    private void initUIView(View paramView) {
        initHeaderView(paramView);
        this.topBarTitleTxt.setVisibility(0);
        this.topBarTitleTxt.setText("Billing Methods");
        this.backBtn.setOnClickListener(this);
    }

    public void onClick(View paramView) {
        if (paramView == this.backBtn) {
            getActivity().onBackPressed();
        }
    }

    @Nullable
    public View onCreateView(LayoutInflater paramLayoutInflater, @Nullable ViewGroup paramViewGroup, @Nullable Bundle paramBundle) {
        return paramLayoutInflater.inflate(2130968607, paramViewGroup, false);
    }

    public void onViewCreated(View paramView, @Nullable Bundle paramBundle) {
        super.onViewCreated(paramView, paramBundle);
        initUIView(paramView);
    }
}

