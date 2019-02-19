package com.bkjk.henry.hotfix.andfixdemo.module;

/**
 * Author: zhouzhenhua
 * Date: 2019/2/19
 * Version: 1.0.0
 * Description:
 */
public class PatchInfo {
    /**
     * 不为空则表明有更新
     */
    public String downloadUrl;

    /**
     * 本次patch包的版本号
     */
    public String versionName;

    /**
     * 本次patch包含的相关信息，例如：主要做了那些改动
     */
    public String patchMessage;

    /**
     * patch文件正确的md5值
     */
    public String md5;
}
