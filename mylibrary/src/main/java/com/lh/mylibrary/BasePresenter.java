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

/**
 * MVP
 * 基础界面方法实现的接收器和分发器
 * 用于数据的传递和界面对应方法的实现
 */
public interface BasePresenter {

    /**
     * 在此方法判断网络是否可用和界面对应初始化情况
     */
    void start();

}
