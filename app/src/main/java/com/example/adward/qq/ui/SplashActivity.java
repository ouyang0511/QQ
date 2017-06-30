package com.example.adward.qq.ui;

import android.content.Intent;
import android.os.Handler;

import com.example.adward.qq.MainActivity;
import com.example.adward.qq.Presenter.SplashPresenter;
import com.example.adward.qq.Presenter.impl.SplashPresenterImpl;
import com.example.adward.qq.R;
import com.example.adward.qq.view.SplashView;

/**
 * Created by Adward on 2016/12/28.
 */

public class SplashActivity extends BaseActivity implements SplashView {
    private SplashPresenter mSplashPresenter;
    private Handler mHandler = new Handler();
    private static final int DELAY = 2000;

    public int getLayoutResId() {
        return R.layout.activity_splash;
    }

    @Override
    protected void init() {
        super.init();
        mSplashPresenter = new SplashPresenterImpl(this);
        mSplashPresenter.checkLoginStatus();
        /*if(checkLoginStatus()){
            //已经登录则调到主界面
            navigateTOMain();

        }else
        {
            navigateTOLogin();

        }*/
    }

    private void navigateTOLogin() {
        mHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        }, DELAY);
    }

    private void navigateTOMain() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    private boolean checkLoginStatus() {
        return false;
    }

    @Override
    public void onLoggindIn() {
        navigateTOMain();
    }

    @Override
    public void onNoLoggndIn() {
        navigateTOLogin();
    }
}
