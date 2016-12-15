package com.lh.mylibrary;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;

import com.lh.mylibrary.utils.DialogUtil;
import com.lh.mylibrary.utils.ToastUtil;

/**
 * Fragment基础类 封装了部分Mvp操作
 */
public abstract class BaseFragment extends Fragment {

    protected boolean isVisible;
    public boolean isRefresh = true;
    public boolean loading = false;
    public int pageNo = 1;
    public String TAG = getClass().getSimpleName();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public boolean isActive() {
        return isAdded();
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    public void showLoading(String msg) {
        DialogUtil.showProgress(getActivity(), TextUtils.isEmpty(msg) ? "加载中" : msg, true);
    }

    public void showLoading(String msg, boolean cancel) {
        DialogUtil.showProgress(getActivity(), TextUtils.isEmpty(msg) ? "加载中" : msg, cancel);
    }

    public void hideLoading() {
        DialogUtil.closeProgress();
    }

    public void showMessage(String msg) {
        if (!TextUtils.isEmpty(msg))
            ToastUtil.showShort(getContext(), msg);
    }

    public Context getCotext() {
        return getContext().getApplicationContext();
    }
}
