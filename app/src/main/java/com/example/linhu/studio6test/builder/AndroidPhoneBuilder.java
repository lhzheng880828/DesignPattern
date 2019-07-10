package com.example.linhu.studio6test.builder;

/**
 * Author:linhu
 * Email:lhzheng@grandstream.cn
 * Date:19-5-6
 */
public class AndroidPhoneBuilder extends PhoneBuilder {
    private Phone androidPhone = new AndroidPhone();
    @Override
    public void buildBoard(String board) {

        androidPhone.setBoard(board);
    }

    @Override
    public void buildLcd(String lcd) {

        androidPhone.setLcd(lcd);
    }

    @Override
    public void buildOs() {

        androidPhone.setOs();
    }

    @Override
    public Phone build() {
        return androidPhone;
    }
}
