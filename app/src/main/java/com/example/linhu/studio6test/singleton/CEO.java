package com.example.linhu.studio6test.singleton;

import android.util.Log;

/**
 * Author:linhu
 * Email:lhzheng@grandstream.cn
 * Date:19-4-24
 */
//CEO, 饿汉单例模式
public class CEO extends Staff {
    private static final CEO mCEO = new CEO();
    //私有构造函数
    private CEO(){

    }

    //公有的静态函数, 对外暴露获取单例对象的接口
    public static CEO getmCEO(){
        return mCEO;
    }

    @Override
    public void work() {
        Log.d(getTag(), "我负责管理VP");
    }
}
