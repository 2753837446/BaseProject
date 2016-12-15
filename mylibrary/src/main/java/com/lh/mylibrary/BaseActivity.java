package com.lh.mylibrary;

import android.content.Context;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.inputmethod.InputMethodManager;

import com.lh.mylibrary.utils.DialogUtil;
import com.lh.mylibrary.utils.ToastUtil;

/**
 * 描述   Activity基类  封装了部分Mvp操作
 * 作者   \(^o^)/~
 * 时间   2016/6/17
 */

public abstract class BaseActivity extends AppCompatActivity {

    public String TAG = getClass().getSimpleName();
    public boolean active;

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
    }


    @Override
    // 点击空白处，隐藏软键盘
    public boolean onTouchEvent(MotionEvent event) {
        if (null != this.getCurrentFocus()) {
            /**
             * 点击空白位置 隐藏软键盘
             */
            InputMethodManager mInputMethodManager = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
            return mInputMethodManager.hideSoftInputFromWindow(this.getCurrentFocus().getWindowToken(), 0);
        }
        return super.onTouchEvent(event);
    }


    public void showLoading(String msg) {
        DialogUtil.showProgress(this, TextUtils.isEmpty(msg) ? "加载中" : msg);
    }

    public void hideLoading() {
      DialogUtil.closeProgress();
    }

    public void showMessage(String msg) {
        if (!TextUtils.isEmpty(msg))
            ToastUtil.showShort(this, msg);
    }

    public boolean isActive() {
        return active;
    }

    @Override
    protected void onResume() {
        super.onResume();
        active = true;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        active = false;
    }

    public Context getCotext() {
        return this.getApplicationContext();
    }
}
