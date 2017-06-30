package com.example.adward.qq.ui;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Adward on 2016/12/28.
 *
 */

public abstract class BaseFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
         View root = inflater.inflate(getLayoutResId(),null);
        init();
        return root;
    }

    protected  void init(){

    }
    public abstract int getLayoutResId();
}


