package com.example.adward.qq.Presenter.impl;

import com.example.adward.qq.Presenter.SplashPresenter;
import com.example.adward.qq.view.SplashView;

/**
 * Created by Adward on 2016/12/28.
 */

public class SplashPresenterImpl implements SplashPresenter {


    private SplashView mSplashView;
    public SplashPresenterImpl(SplashView view){
        mSplashView = view;
    }

    public void checkLoginStatus() {

        if(isLoggedIn()){
            mSplashView.onLoggindIn();
        }else {
            mSplashView.onNoLoggndIn();
        }

    }

    private boolean isLoggedIn() {

        return false;
    }
}
