package com.xs.ndkdemo.utils;

/**
 * @version V1.0 <描述当前版本功能>
 * @author: Xs
 * @date: 2016-07-29 09:34
 * @email Xs.lin@foxmail.com
 */
public class JniUtil {

    static {
        System.loadLibrary("jniTest");
    }

    public static native String getStringFromC();
    public static native String getStringByboolean(boolean flag);
}
