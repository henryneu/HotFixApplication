package com.bkjk.henry.hotfix.andfixdemo.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.bkjk.henry.hotfix.R;
import com.bkjk.henry.hotfix.andfixdemo.andfix.AndFixPatchManager;
import com.bkjk.henry.hotfix.utils.HotFixedBugTest;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    private static final String FILE_END = ".apatch";

    private String mPathDir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPathDir = getExternalCacheDir().getAbsolutePath() + "/apatch/";
        // 创建 Patch 文件的文件夹
        File file = new File(mPathDir);
        if (file == null || !file.exists()) {
            file.mkdir();
            Log.e("MainActivity", "file:" + file);
        }
    }

    /**
     * 测试bug
     */
    public void testBug(View view) {
        HotFixedBugTest hotFixedBugTest = new HotFixedBugTest();
        hotFixedBugTest.addBug(MainActivity.this);
    }

    /**
     * 加载Patch文件
     */
    public void loadPatch(View view) {
        AndFixPatchManager.getInstance(MainActivity.this).addPatch(getPatchName());
        Toast.makeText(MainActivity.this, "hahaha", Toast.LENGTH_SHORT).show();
    }

    /**
     * 获取Patch文件名
     *
     * @return
     */
    private String getPatchName() {
        return mPathDir.concat("apphenry").concat(FILE_END);
    }
}
