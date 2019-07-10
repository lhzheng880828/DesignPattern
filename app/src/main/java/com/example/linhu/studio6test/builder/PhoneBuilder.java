package com.example.linhu.studio6test.builder;

/**
 * Author:linhu
 * Email:lhzheng@grandstream.cn
 * Date:19-5-6
 */
public abstract class PhoneBuilder {
    public abstract void buildBoard(String board);
    public abstract void buildLcd(String lcd);
    public abstract void buildOs();
    public abstract Phone build();
}
