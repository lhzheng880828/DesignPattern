package com.example.linhu.studio6test.singleton;

/**
 * Author:linhu
 * Email:lhzheng@grandstream.cn
 * Date:19-4-24
 */
public class Test {
    public static void test(){
        Company company = new Company();
        //CEO对象只能通过getCEO函数获取
        Staff ceo1 = CEO.getmCEO();
        Staff ceo2 = CEO.getmCEO();
        company.addStaff(ceo1);
        company.addStaff(ceo2);
        //通过new创建VP
        Staff vp1 = new VP();
        Staff vp2 = new VP();
        company.addStaff(vp1);
        company.addStaff(vp2);
        //通过new创建Staff
        Staff staff1 = new Staff();
        Staff staff2 = new Staff();
        Staff staff3 = new Staff();
        company.addStaff(staff1);
        company.addStaff(staff2);
        company.addStaff(staff3);

        company.showAllStaffs();
    }

    public static void testSingleton(){
        //懒汉模式获取单例
        Singleton singleton = Singleton.getInstance();
        //双重锁获取单例
        Singleton singleton2 = Singleton.getInstance2();
        //静态内部类单例
        Singleton singleton3 = Singleton.getInstance3();
        //枚举获取单例
        SingletonEnum.INSTANCE.doSomething();
    }
}
