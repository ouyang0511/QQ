package com.example.adward.qq.ui;

import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.adward.qq.R;

import butterknife.BindView;
import butterknife.OnClick;


public class LoginActivity extends BaseActivity {

    @BindView(R.id.mUser_name)
    EditText userName;
    @BindView(R.id.mPassword)
    EditText password;
    @BindView(R.id.login)
    Button login;
    @BindView(R.id.new_user)
    TextView newUser;

    @Override
    public int getLayoutResId() {

        return R.layout.activity_login;
    }

    @Override
    protected void init() {
        super.init();

    }


    @OnClick(R.id.new_user)
    public void onClick() {
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);

    }
}
