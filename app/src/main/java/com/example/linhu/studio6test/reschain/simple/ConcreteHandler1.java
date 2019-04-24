package com.example.linhu.studio6test.reschain.simple;

/**
 * Author:linhu
 * Email:lhzheng@grandstream.cn
 * Date:19-4-22
 */
public class ConcreteHandler1 extends AbsHandler {
    @Override
    public void handleRequest(String condition) {

        if(condition.equals("ConcreteHandler1")){
            return;
        }else{
            successor.handleRequest(condition);
        }
    }
}
