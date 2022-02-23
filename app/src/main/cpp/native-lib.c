#include <jni.h>

JNIEXPORT jstring JNICALL Java_com_example_myapplication3_MainActivity_stringFromJNI(JNIEnv *env, jobject o) {
    return (*env)->NewStringUTF(env, "Hello, World!");
}

JNIEXPORT jint JNICALL Java_com_example_myapplication3_MainActivity_addnum(JNIEnv *env, jobject o, jint a, jint b) {
    if (a == b) {
        return a*b;
    }
    return a + b;
}