package com.example.linhu.studio6test.builder;

/**
 * Author:linhu
 * Email:lhzheng@grandstream.cn
 * Date:19-5-6
 */
public class Director {

    PhoneBuilder mBuilder = null;

    public Director(PhoneBuilder builder){
        mBuilder = builder;
    }

    public Phone contruct(String board, String lcd){
        mBuilder.buildBoard(board);
        mBuilder.buildLcd(lcd);
        mBuilder.buildOs();
        return mBuilder.build();
    }

}
