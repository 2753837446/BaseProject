/*
 * Copyright 2016, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.lh.mylibrary;

import android.content.Context;
import android.support.annotation.Nullable;

/**
 * Mvp架构
 * 基础界面要实现的View
 */
public interface BaseView<T> {

    Context getCotext();

    /**
     * 显示进度条
     *
     * @param msg
     */
    void showLoading(String msg);

    /**
     * 收起进度条
     */
    void hideLoading();

    /**
     * 显示提示信息
     *
     * @param msg
     */
    void showMessage(String msg);

    /**
     * 标示当前view是否被初始化(presenter用于判断是否可以吊起界面方法 避免空指针出现)
     *
     * @return
     */
    boolean isActive();

    /**
     * 请求成功返回数据
     *
     * @param t
     * @param id
     */
    void setData(T t, @Nullable int id);

}
