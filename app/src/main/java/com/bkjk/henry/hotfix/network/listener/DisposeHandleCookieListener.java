package com.bkjk.henry.hotfix.network.listener;

import java.util.ArrayList;

/**
 * Author: zhouzhenhua
 * Date: 2019/2/15
 * Version: 1.0.0
 * Description:当需要专门处理Cookie时创建此回调接口
 */
public interface DisposeHandleCookieListener extends DisposeDataListener {
    public void onCookie(ArrayList<String> cookieStrLists);
}
