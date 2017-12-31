package com.kissdream.androidjnitest;

/**
 * Created by PVer on 2017/12/30.
 */

public class myJNIUtils {

    static {
        //名字注意，需要跟你的build.gradle ndk节点下面的名字一样
//        NameProvider就是你要生成d的.so文件的文件名
        System.loadLibrary("serial_port");
    }
    //JNI接口需要用native关键字修饰
    public native String getName();


}
