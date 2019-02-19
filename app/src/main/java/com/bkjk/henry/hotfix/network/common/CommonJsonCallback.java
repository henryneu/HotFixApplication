package com.bkjk.henry.hotfix.network.common;

import android.os.Handler;
import android.os.Looper;

import com.bkjk.henry.hotfix.network.listener.DisposeDataHandle;
import com.bkjk.henry.hotfix.network.listener.DisposeDataListener;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/**
 * Author: zhouzhenhua
 * Date: 2019/2/19
 * Version: 1.0.0
 * Description:
 */
public class CommonJsonCallback implements Callback {

    /**
     * 将其它线程的数据转发到UI线程
     */
    private Handler mDeliveryHandler;
    private DisposeDataListener mListener;
    private Class<?> mClass;

    public CommonJsonCallback(DisposeDataHandle handle) {
        this.mListener = handle.mListener;
        this.mClass = handle.mClass;
        this.mDeliveryHandler = new Handler(Looper.getMainLooper());
    }

    @Override
    public void onFailure(Call call, IOException e) {

    }

    @Override
    public void onResponse(Call call, Response response) throws IOException {

    }
}
