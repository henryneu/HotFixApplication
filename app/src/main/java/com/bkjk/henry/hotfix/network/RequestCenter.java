package com.bkjk.henry.hotfix.network;

import com.bkjk.henry.hotfix.andfixdemo.module.BasePatch;
import com.bkjk.henry.hotfix.network.common.CommonOkHttpClient;
import com.bkjk.henry.hotfix.network.common.CommonRequest;
import com.bkjk.henry.hotfix.network.constants.HttpConstant;
import com.bkjk.henry.hotfix.network.listener.DisposeDataHandle;
import com.bkjk.henry.hotfix.network.listener.DisposeDataListener;
import com.bkjk.henry.hotfix.network.request.RequestParams;

/**
 * Author: zhouzhenhua
 * Date: 2019/2/15
 * Version: 1.0.0
 * Description:网络请求发送
 */
public class RequestCenter {

    /**
     * 根据接收的参数，发送 post 请求
     *
     * @param url
     * @param params
     * @param listener
     * @param clazz
     */
    public static void postRequest(String url, RequestParams params, DisposeDataListener listener, Class<?> clazz) {
        CommonOkHttpClient.get(CommonRequest.createGetRequest(url, params), new DisposeDataHandle(listener, clazz));
    }

    /**
     * 询问是否有 patch 可更新
     *
     * @param listener
     */
    public static void requestPatchUpdateInfo(DisposeDataListener listener) {
        RequestCenter.postRequest(HttpConstant.UPDATE_PATCH_URL, null, listener, BasePatch.class);
    }
}
