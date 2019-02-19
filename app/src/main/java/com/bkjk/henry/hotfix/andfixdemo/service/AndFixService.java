package com.bkjk.henry.hotfix.andfixdemo.service;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.support.annotation.Nullable;
import android.util.Log;

import java.io.File;

/**
 * Author: zhouzhenhua
 * Date: 2019/1/30
 * Version: 1.0.0
 * Description:AndFix热修复后台服务
 */
public class AndFixService extends Service {

    private static final int CHECK_UPDATE_PATCH = 0x01;
    private static final int DOWNLOAD_PATCH = 0x02;

    private String mPatchFileDir;
    private String mPatchFile;
    private AndFixHandler mHandler;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        // 初始化操作
        init();
        mHandler = new AndFixHandler();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        mHandler.sendEmptyMessage(CHECK_UPDATE_PATCH);
        return START_NOT_STICKY;
    }

    /**
     * 初始化文件目录
     */
    private void init() {
        mPatchFileDir = getExternalCacheDir().getAbsolutePath() + "/apatch/";
        File patchDir = new File(mPatchFileDir);

        try {
            if (patchDir == null || !patchDir.exists()) {
                patchDir.mkdir();
                Log.e("AndFixService", "patchDir:" + patchDir);
            }
        } catch (Exception e) {
            e.printStackTrace();
            stopSelf();
        }
    }

    class AndFixHandler extends Handler {
        @Override
        public void handleMessage(Message msg) {
            if (msg.what == CHECK_UPDATE_PATCH) {
                // 检查服务器是否有 patch 包
                checkUpdatePatch();
            } else if (msg.what == DOWNLOAD_PATCH) {
                // 下载 patch 包
                downloadPatch();
            }
        }
    }

    /**
     * 检查服务器是否有 patch 包
     */
    private void checkUpdatePatch() {

    }

    /**
     * 下载 patch 包
     */
    private void downloadPatch() {

    }
}
