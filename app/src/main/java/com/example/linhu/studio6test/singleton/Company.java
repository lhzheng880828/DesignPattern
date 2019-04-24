package com.example.linhu.studio6test.singleton;

import java.util.ArrayList;
import java.util.List;

/**
 * Author:linhu
 * Email:lhzheng@grandstream.cn
 * Date:19-4-24
 */
public class Company {
    private List<Staff> allStaffs = new ArrayList<Staff>();

    public void addStaff(Staff per){
        allStaffs.add(per);
    }

    public void showAllStaffs(){
        for(Staff per: allStaffs){
            System.out.println("Obj: "+per.toString());
        }
    }
}
