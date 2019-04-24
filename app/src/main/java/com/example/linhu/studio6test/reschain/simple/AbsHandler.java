package com.example.linhu.studio6test.reschain.simple;

/**
 * Author:linhu
 * Email:lhzheng@grandstream.cn
 * Date:19-4-22
 */
public abstract class AbsHandler {
    protected AbsHandler successor;

    public abstract void handleRequest(String condition);
}
