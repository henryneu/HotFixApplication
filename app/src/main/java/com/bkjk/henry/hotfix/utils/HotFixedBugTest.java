package com.bkjk.henry.hotfix.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Author: zhouzhenhua
 * Date: 2018/12/9
 * Version: 1.0.0
 * Description:
 */
public class HotFixedBugTest {
    public void addBug(Context context) {
        int i = 10;
        int j = 1;
        Toast.makeText(context, "Hello, The calculation results is: " + (i / j), Toast.LENGTH_SHORT).show();
    }
}
