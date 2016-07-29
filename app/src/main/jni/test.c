//
// Created by Administrator on 2016/7/29.
//
#include "com_xs_ndkdemo_utils_JniUtil.h"

JNIEXPORT jstring JNICALL Java_com_xs_ndkdemo_utils_JniUtil_getStringFromC
  (JNIEnv *env, jobject obj) {
    return (*env) -> NewStringUTF(env,"this is getStringFromC method ");
  }

JNIEXPORT jstring JNICALL Java_com_xs_ndkdemo_utils_JniUtil_getStringByboolean
        (JNIEnv *env, jclass jclass1, jboolean jboolean1) {
    if (jboolean1) {
        return (*env)->NewStringUTF(env,"true");
    }
    return (*env)->NewStringUTF(env,"false");
}

