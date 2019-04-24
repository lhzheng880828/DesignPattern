package com.example.linhu.studio6test.reschain.complex;

/**
 * Author:linhu
 * Email:lhzheng@grandstream.cn
 * Date:19-4-22
 */
public abstract class AbstractRequest {

    private Object object;

    public AbstractRequest(Object object){
        this.object = object;
    }

    public Object getContent(){
        return object;
    }

    public abstract int getRequestLevel();
}
