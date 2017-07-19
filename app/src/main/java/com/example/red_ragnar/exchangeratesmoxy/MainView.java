package com.example.red_ragnar.exchangeratesmoxy;

import android.support.annotation.StringRes;

import com.arellomobile.mvp.MvpView;

/**
 * Created by Red_Ragnar on 19.07.2017.
 */

public interface MainView  extends MvpView{
    void toggleMessageLoading(boolean isLoading);

    void showMessage(@StringRes int messageResId);
}
