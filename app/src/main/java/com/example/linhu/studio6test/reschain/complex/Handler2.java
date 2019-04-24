package com.example.linhu.studio6test.reschain.complex;

import android.util.Log;

/**
 * Author:linhu
 * Email:lhzheng@grandstream.cn
 * Date:19-4-22
 */
public class Handler2 extends AbstractHandler {

    @Override
    protected int getHandleLevel() {
        return 2;
    }

    @Override
    protected void handle(AbstractRequest request) {
        Log.d(TAG, "Handler2 handler request:"+request.getRequestLevel());
    }
}
