package com.bkjk.henry.hotfix.network.constants;

/**
 * Author: zhouzhenhua
 * Date: 2019/2/18
 * Version: 1.0.0
 * Description:Http常量
 */
public class HttpConstant {

    private static final String ROOT_URL = "http://www.imooc.com/api";

    /**
     * 检查是否有patch文件更新
     */
    public static String UPDATE_PATCH_URL = ROOT_URL + "/tinker/update.php";

    /**
     * patch文件下载地址
     */
    public static String DOWNLOAD_PATCH_URL = ROOT_URL + "/tinker/download_patch.php";
}
