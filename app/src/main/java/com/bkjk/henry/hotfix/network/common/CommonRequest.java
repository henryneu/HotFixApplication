package com.bkjk.henry.hotfix.network.common;

import com.bkjk.henry.hotfix.network.request.RequestParams;

import java.util.Map;

import okhttp3.Headers;
import okhttp3.Request;

/**
 * Author: zhouzhenhua
 * Date: 2019/2/19
 * Version: 1.0.0
 * Description:
 */
public class CommonRequest {

    public static Request createGetRequest(String url, RequestParams params) {
        return createGetRequest(url, params, null);
    }

    private static Request createGetRequest(String url, RequestParams params, RequestParams headers) {
        StringBuilder urlBuilder = new StringBuilder(url).append("?");
        if (params != null) {
            for (Map.Entry<String, String> entry : params.urlParams.entrySet()) {
                urlBuilder.append(entry.getKey()).append("=").append(entry.getValue()).append("&");
            }
        }
        // 添加请求头
        Headers.Builder mHeaderBuilder = new Headers.Builder();
        if (headers != null) {
            for (Map.Entry<String, String> entry : headers.urlParams.entrySet()) {
                mHeaderBuilder.add(entry.getKey(), entry.getValue());
            }
        }
        Headers mHeaders = mHeaderBuilder.build();
        return new Request.Builder()
                .url(urlBuilder.substring(0, urlBuilder.length() - 1))
                .get()
                .headers(mHeaders)
                .build();
    }
}
