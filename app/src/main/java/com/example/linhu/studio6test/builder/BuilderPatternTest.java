package com.example.linhu.studio6test.builder;

/**
 * Author:linhu
 * Email:lhzheng@grandstream.cn
 * Date:19-5-6
 */
public class BuilderPatternTest {

    public static void testMain(){
        //Iphone构造器
        PhoneBuilder builder = new IphoneBuilder();
        //Director
        Director director = new Director(builder);
        Phone phone = director.contruct("Intel主板", "三星LCD");
        //构造一台Iphone
        System.out.println("Phone info = "+phone.toString());

        //AndroidPhone构造器
        PhoneBuilder andBuild = new AndroidPhoneBuilder();
        //Director
        Director andDirector = new Director(andBuild);
        Phone andPhone = andDirector.contruct("国产主板", "国产LCD");
        //构造一台AndroidPhone
        System.out.println("Phone info = "+andPhone.toString());


    }

}
