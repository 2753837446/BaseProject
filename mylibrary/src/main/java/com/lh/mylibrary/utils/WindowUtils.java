package com.lh.mylibrary.utils;

import android.app.Activity;
import android.view.WindowManager;

/**
 * Created by luhao on 2016/11/17.
 */

public class WindowUtils {

    /**
     * 设置添加屏幕的背景透明度
     *
     * @param bgAlpha
     */
    public static void background(Activity activity, float alpha) {
        WindowManager.LayoutParams lp = activity.getWindow().getAttributes();
        lp.alpha = alpha; //0.0-1.0
        activity.getWindow().setAttributes(lp);
    }
}
