package com.example.linhu.studio6test.builder;

/**
 * Author:linhu
 * Email:lhzheng@grandstream.cn
 * Date:19-5-6
 */
public class IphoneBuilder extends PhoneBuilder {
    private Phone iphone = new Iphone();
    @Override
    public void buildBoard(String board) {
        iphone.setBoard(board);
    }

    @Override
    public void buildLcd(String lcd) {

        iphone.setLcd(lcd);
    }

    @Override
    public void buildOs() {

        iphone.setOs();
    }

    @Override
    public Phone build() {
        return iphone;
    }
}
