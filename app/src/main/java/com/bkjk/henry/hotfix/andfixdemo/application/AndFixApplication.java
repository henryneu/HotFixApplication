package com.bkjk.henry.hotfix.andfixdemo.application;

import android.app.Application;

import com.bkjk.henry.hotfix.andfixdemo.andfix.AndFixPatchManager;

/**
 * Author: zhouzhenhua
 * Date: 2019/1/24
 * Version: 1.0.0
 * Description:AndFix热修复启动应用
 */
public class AndFixApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // 初始化AndFix
        initAndFix();
    }

    /**
     * 初始化AndFix
     */
    private void initAndFix() {
        AndFixPatchManager.getInstance(this).initPatch();
    }
}
