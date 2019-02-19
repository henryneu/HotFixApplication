package com.bkjk.henry.hotfix.andfixdemo.andfix;

import android.content.Context;

import com.alipay.euler.andfix.patch.PatchManager;
import com.bkjk.henry.hotfix.utils.AppUtils;

import java.io.IOException;

/**
 * Author: zhouzhenhua
 * Date: 2019/1/24
 * Version: 1.0.0
 * Description:封装PatchManager
 */
public class AndFixPatchManager {

    private static AndFixPatchManager sInstance = null;
    private Context mContext;
    private static PatchManager mPatchManager = null;

    /**
     * 单例创建 AndFixPatchManager
     *
     * @return
     */
    public static AndFixPatchManager getInstance(Context context) {
        if (sInstance == null) {
            synchronized (AndFixPatchManager.class) {
                if (sInstance == null) {
                    sInstance = new AndFixPatchManager(context);
                }
            }
        }
        return sInstance;
    }

    private AndFixPatchManager(Context context) {
        mContext = context;
    }

    /**
     * 初始化 PatchManager
     */
    public void initPatch() {
        mPatchManager = new PatchManager(mContext);
        String versionName = AppUtils.getCurrentAppVersion(mContext);
        mPatchManager.init(versionName);
        // 加载 patch 文件
        mPatchManager.loadPatch();
    }

    /**
     * 加载Patch文件
     */
    public void addPatch(String patchPath) {
        try {
            if (mPatchManager != null) {
                mPatchManager.addPatch(patchPath);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
