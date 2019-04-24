package com.example.linhu.studio6test.singleton;

import android.util.Log;

/**
 * Author:linhu
 * Email:lhzheng@grandstream.cn
 * Date:19-4-24
 */
public class VP extends Staff {
    @Override
    public void work() {
        Log.d(getTag(),"我负责管理经理");
    }
}
