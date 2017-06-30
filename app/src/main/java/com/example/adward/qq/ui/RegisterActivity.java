package com.example.adward.qq.ui;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.adward.qq.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.bmob.v3.BmobUser;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.SaveListener;

/**
 * Created by Adward on 2016/12/29.
 */
public class RegisterActivity extends BaseActivity {


    @BindView(R.id.user_name)
    EditText mUserName;
    @BindView(R.id.password)
    EditText mPassword;
    @BindView(R.id.mConfirmPassword)
    EditText mConfirmPassword;
    @BindView(R.id.register)
    Button mRegister;

    @Override
    public int getLayoutResId() {

        return R.layout.activity_register;
    }

    @Override
    protected void init() {
        super.init();
    mConfirmPassword.setOnEditorActionListener(mOnEditorActionListener);
    }

    private TextView.OnEditorActionListener mOnEditorActionListener = new TextView.OnEditorActionListener() {
        @Override
        public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
            if (actionId== EditorInfo.IME_ACTION_DONE){
                register();
                return true;
            }
            return false;
        }
    };
    @OnClick(R.id.register)
    public void onClick() {
        register();

    }

    private void register() {
        String userName = mUserName.getText().toString().trim();
        String password = mPassword.getText().toString().trim();
        String comfirmPassword = mConfirmPassword.getText().toString().trim();
        BmobUser bmobUser=new BmobUser();
        bmobUser.setUsername(userName);
        bmobUser.setPassword(password);
        bmobUser.signUp(new SaveListener<BmobUser>() {
            @Override
            public void done(BmobUser bmobUser, BmobException e) {
                if(e==null){
                    Toast.makeText(RegisterActivity.this,"注册成功",Toast.LENGTH_SHORT);
                }else {
                    Toast.makeText(RegisterActivity.this,"注册失败",Toast.LENGTH_SHORT);
                }
            }
        })
    }


}
