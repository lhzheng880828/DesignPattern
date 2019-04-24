package com.example.linhu.studio6test.reschain.simple;

/**
 * Author:linhu
 * Email:lhzheng@grandstream.cn
 * Date:19-4-22
 */
public class Client {
    public static void handlerRequest(){
        AbsHandler handler1 = new ConcreteHandler1();
        AbsHandler handler2 = new ConcreteHandler2();
        handler1.successor = handler2;
        handler2.successor = handler1;

        handler1.handleRequest("ConcreteHandler2");
    }
}
