package com.lh.mylibrary.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by luhao on 2016/11/19.
 */

public class FileUtils {


    private String tempPath;

    /**
     * 获取临时文件存放目录
     *
     * @param context
     * @return
     */
    public static String getTempFileDir(Context context) {
        String path = getFileDir(context);
        File file = new File(path);
        if (!file.exists())
            file.mkdirs();
        return path;
    }


    /**
     * 获取临时文件存放目录
     *
     * @param context
     * @return
     */
    public static String getFileDir(Context context) {
        String path = isExternalMemoryAvailable() ?
                context.getExternalFilesDir(null).getPath() + "/" : context
                .getFilesDir().getPath() + "/";
        File file = new File(path);
        if (!file.exists())
            file.mkdirs();
        return path;
    }


    /**
     * 判断是否有外部存储
     *
     * @return 如果有返回true，否则false
     */
    public static boolean isExternalMemoryAvailable() {
        return Environment.MEDIA_MOUNTED.equals(Environment
                .getExternalStorageState());
    }


    /**
     * 获取保存地址uri
     *
     * @param context
     * @return
     */
    public Uri getTempUri(Context context) {
        return Uri.fromFile(getTempFile(context.getApplicationContext()));
    }

    private File getTempFile(Context applicationContext) {
        String savedir = getTempFileDir(applicationContext);
        File dir = new File(savedir);
        if (!dir.exists())
            dir.mkdirs();
        // 保存入sdCard
        tempPath = savedir + getTimeStr2() + ".jpg";// 保存路径

        File file = new File(tempPath);
        try {
            boolean newFile = file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }

    /**
     * 功能描述：获取格式化时间串(yyyyMMdd_HHmmss)
     * 程序作者：WHB
     * 编写时间：[2014-7-3]-[上午10:49:46]
     *
     * @return
     */
    @SuppressLint("SimpleDateFormat")
    public static String getTimeStr2() {
        Date date = new Date(System.currentTimeMillis());
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
        return dateFormat.format(date);// + ".jpg";
    }

}
