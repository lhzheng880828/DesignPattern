package com.example.linhu.studio6test.reschain.complex;

import android.util.Log;

/**
 * Author:linhu
 * Email:lhzheng@grandstream.cn
 * Date:19-4-22
 */
public abstract class AbstractHandler {

    protected static final String TAG = AbstractHandler.class.getSimpleName();

    protected AbstractHandler nextHandler;

    public final void handleRequest(AbstractRequest request){

        if(getHandleLevel() == request.getRequestLevel()){
            handle(request);
        }else{
            if(nextHandler!=null){
                nextHandler.handle(request);
            }else{
                //当所有处理者对象均不能处理该请求时输出
                Log.d(TAG,"All of handler can not handle the request");
            }
        }
    }

    protected abstract int getHandleLevel();

    protected abstract void handle(AbstractRequest request);
}
