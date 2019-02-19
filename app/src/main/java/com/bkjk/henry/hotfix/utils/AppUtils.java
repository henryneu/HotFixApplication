package com.bkjk.henry.hotfix.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/**
 * Author: zhouzhenhua
 * Date: 2019/1/24
 * Version: 1.0.0
 * Description:App工具类，获取与App相关信息
 */
public class AppUtils {

    /**
     * 获取当前应用的版本信息
     *
     * @return
     */
    public static String getCurrentAppVersion(Context context) {
        String versionName = "1.0.0";
        try {
            PackageManager pm = context.getPackageManager();
            PackageInfo pi = pm.getPackageInfo(context.getPackageName(), 0);
            versionName = pi.versionName;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return versionName;
    }
}
