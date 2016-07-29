package com.xs.ndkdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.xs.ndkdemo.utils.JniUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView mTvJniShow = (TextView) findViewById(R.id.tv_jni_show);
        mTvJniShow.setText(JniUtil.getStringFromC());
        final TextView mTvJniShow2 = (TextView) findViewById(R.id.tv_jni_show2);
        mTvJniShow2.setText(JniUtil.getStringByboolean(false));
    }
}
