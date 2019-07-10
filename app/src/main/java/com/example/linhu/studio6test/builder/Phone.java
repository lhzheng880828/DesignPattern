package com.example.linhu.studio6test.builder;

/**
 * Author:linhu
 * Email:lhzheng@grandstream.cn
 * Date:19-5-6
 */
public abstract class Phone {
    protected String mBoard;
    protected String mLcd;
    protected String mOs;

    //设置主板
    public void setBoard(String board){
        mBoard = board;
    }
    //设置Lcd
    public void setLcd(String lcd){
        mLcd = lcd;
    }

    //设置操作系统
    public abstract void setOs();

    @Override
    public String toString() {
        return "Phone{" +
                "mBoard='" + mBoard + '\'' +
                ", mLcd='" + mLcd + '\'' +
                ", mOs='" + mOs + '\'' +
                '}';
    }
}
