package com.lh.mylibrary.utils;

import android.content.Context;
import android.text.TextUtils;

import com.rctx.InternetBar.user.bean.LoginResponse;

/**
 * 本地用户管理类
 * Created by luhao on 2016/11/30.
 */

public class UserUtils {

    /**
     * 保存用户信息
     *
     * @param context
     * @param user
     */
    public static void saveUser(Context context, LoginResponse.UserBean user) {

        PreferenceUtil.putLong(context, "id", user.getUserId());
        PreferenceUtil.putString(context, "userName", user.getUserName());
        PreferenceUtil.putString(context, "userNick", user.getUserNick());
        PreferenceUtil.putString(context, "userPhone", user.getUserPhone());
        PreferenceUtil.putString(context, "userCode", user.getUserCode());
        PreferenceUtil.putString(context, "protImg", user.getProtImg());
        PreferenceUtil.putString(context, "menWomen", user.getMenWomen());
        PreferenceUtil.putString(context, "country", user.getCountry());
        PreferenceUtil.putString(context, "countryCode", user.getCountryCode());
        PreferenceUtil.putString(context, "provinces", user.getProvinces());
        PreferenceUtil.putString(context, "provincesCode", user.getProvincesCode());
        PreferenceUtil.putString(context, "city", user.getCity());
        PreferenceUtil.putString(context, "cityCode", user.getCityCode());
        PreferenceUtil.putString(context, "locale", user.getLocale());
        PreferenceUtil.putString(context, "localeCode", user.getLocaleCode());
        PreferenceUtil.putString(context, "address", user.getAddress());
        PreferenceUtil.putString(context, "userAccountId", user.getUserAccountId());
        PreferenceUtil.putString(context, "accountMoneyNum", user.getAccountMoneyNum());
        PreferenceUtil.putString(context, "accountCouponsNum", user.getAccountCouponsNum());
        PreferenceUtil.putString(context, "accountGivingNum", user.getAccountGivingNum());
        PreferenceUtil.putString(context, "accountBillNum", user.getAccountBillNum());
        PreferenceUtil.putString(context, "employeesName", user.getEmployeesName());
        PreferenceUtil.putString(context, "upStatus", user.getUpStatus());
        PreferenceUtil.putInt(context, "regSource", user.getRegSource());
        if (!TextUtils.isEmpty(user.getToken()))
            UserUtils.setToken(context, user.getToken());
        UserUtils.setLogin(context, true);
    }

    /**
     * 本地保存token
     *
     * @param context
     * @param token
     */
    public static void setToken(Context context, String token) {
        PreferenceUtil.putString(context, "token", token);
    }

    /**
     * 获取本地保存token
     *
     * @param context
     * @return
     */
    public static String getToken(Context context) {
        return PreferenceUtil.getString(context, "token");
    }

    /**
     * 当前用户是否登录
     *
     * @param context
     * @return
     */
    public static boolean isLogin(Context context) {
        return PreferenceUtil.getBoolean(context, "isLogin", false);
    }

    /**
     * 设置当前用户登录状态
     *
     * @param context
     * @param login
     */
    public static void setLogin(Context context, boolean login) {
        PreferenceUtil.putBoolean(context, "isLogin", login);
    }

    /**
     * 清空当前用户信息
     *
     * @param context
     */
    public static void clearUser(Context context) {
        PreferenceUtil.putLong(context, "id", 0);
        PreferenceUtil.putString(context, "userName", "");
        PreferenceUtil.putString(context, "userNick", "");
        PreferenceUtil.putString(context, "userPhone", "");
        PreferenceUtil.putString(context, "userCode", "");
        PreferenceUtil.putString(context, "protImg", "");
        PreferenceUtil.putString(context, "menWomen", "");
        PreferenceUtil.putString(context, "country", "");
        PreferenceUtil.putString(context, "countryCode", "");
        PreferenceUtil.putString(context, "provinces", "");
        PreferenceUtil.putString(context, "provincesCode", "");
        PreferenceUtil.putString(context, "city", "");
        PreferenceUtil.putString(context, "cityCode", "");
        PreferenceUtil.putString(context, "locale", "");
        PreferenceUtil.putString(context, "localeCode", "");
        PreferenceUtil.putString(context, "address", "");
        PreferenceUtil.putString(context, "userAccountId", "");
        PreferenceUtil.putString(context, "accountMoneyNum", "");
        PreferenceUtil.putString(context, "accountCouponsNum", "");
        PreferenceUtil.putString(context, "accountGivingNum", "");
        PreferenceUtil.putString(context, "accountBillNum", "");
        PreferenceUtil.putString(context, "employeesName", "");
        PreferenceUtil.putString(context, "upStatus", "");
        PreferenceUtil.putInt(context, "regSource", 0);
        UserUtils.setToken(context, "");
        UserUtils.setLogin(context, false);
    }


    /**
     * 获取当前用户信息
     *
     * @return
     */
    public static LoginResponse.UserBean getUser(Context context) {

        LoginResponse.UserBean user = new LoginResponse.UserBean();
        user.setUserId(PreferenceUtil.getLong(context, "id"));
        user.setUserName(PreferenceUtil.getString(context, "userName"));
        user.setUserNick(PreferenceUtil.getString(context, "userNick"));
        user.setUserPhone(PreferenceUtil.getString(context, "userPhone"));
        user.setUserCode(PreferenceUtil.getString(context, "userCode"));
        user.setProtImg(PreferenceUtil.getString(context, "protImg"));
        user.setMenWomen(PreferenceUtil.getString(context, "menWomen"));
        user.setCountry(PreferenceUtil.getString(context, "country"));
        user.setProvinces(PreferenceUtil.getString(context, "provinces"));
        user.setProvincesCode(PreferenceUtil.getString(context, "provincesCode"));
        user.setCity(PreferenceUtil.getString(context, "city"));
        user.setCityCode(PreferenceUtil.getString(context, "cityCode"));
        user.setLocale(PreferenceUtil.getString(context, "locale"));
        user.setLocaleCode(PreferenceUtil.getString(context, "localeCode"));
        user.setAddress(PreferenceUtil.getString(context, "address"));
        user.setUserAccountId(PreferenceUtil.getString(context, "userAccountId"));
        user.setAccountMoneyNum(PreferenceUtil.getString(context, "accountMoneyNum"));
        user.setAccountCouponsNum(PreferenceUtil.getString(context, "accountCouponsNum"));
        user.setAccountGivingNum(PreferenceUtil.getString(context, "accountGivingNum"));
        user.setAccountBillNum(PreferenceUtil.getString(context, "accountBillNum"));
        user.setEmployeesName(PreferenceUtil.getString(context, "employeesName"));
        user.setUpStatus(PreferenceUtil.getString(context, "upStatus"));
        user.setRegSource(PreferenceUtil.getInt(context, "regSource"));
        user.setToken(UserUtils.getToken(context));
        return user;
    }


}
