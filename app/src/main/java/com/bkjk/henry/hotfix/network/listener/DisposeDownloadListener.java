package com.bkjk.henry.hotfix.network.listener;

/**
 * Author: zhouzhenhua
 * Date: 2019/2/15
 * Version: 1.0.0
 * Description:监听下载进度
 */
public interface DisposeDownloadListener extends DisposeDataListener {
    public void onProgress(int progrss);
}
