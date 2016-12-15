package com.lh.mylibrary.utils;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.widget.PopupWindow;

import com.lh.mylibrary.R;

/**
 * 对话框工具类
 * Created by \(^o^)/~ on 2016/7/11.
 */
public class DialogUtil {

    private static AlertDialog dialog;
    private static PopupWindow popupWindow;

    public static void showProgress(Context context, String msg) {
        showProgress(context, msg, false);
    }

    public static void showProgress(Context context, String msg, boolean isCancel) {

        if (dialog == null) dialog = new AlertDialog.Builder(context, R.style.AlertTrans)
                .setView(R.layout.img_loading)
                .setCancelable(isCancel)
                .setOnDismissListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public void onDismiss(DialogInterface dialog1) {
                        dialog = null;
                    }
                })
                .setOnCancelListener(new DialogInterface.OnCancelListener() {
                    @Override
                    public void onCancel(DialogInterface dialog1) {
                        dialog = null;
                    }
                })
                .show();
    }

    public static void showLoading(Context context) {

        dialog = new AlertDialog.Builder(context, R.style.AlertTrans)
                .setView(R.layout.img_loading)
                .setOnDismissListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public void onDismiss(DialogInterface dialog1) {
                        dialog = null;
                    }
                })
                .show();
    }


    public static void closeProgress() {
        if (dialog != null && dialog.isShowing()) {
            dialog.dismiss();
            dialog = null;
        }
    }
}
