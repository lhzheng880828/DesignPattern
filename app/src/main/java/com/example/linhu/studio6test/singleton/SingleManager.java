package com.example.linhu.studio6test.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * Author:linhu
 * Email:lhzheng@grandstream.cn
 * Date:19-4-24
 */
public class SingleManager {
    private static Map<String, Object> objectMap = new HashMap<>();

    private SingleManager(){

    }

    public static void registerService(String key, Object instance){
        if(!objectMap.containsKey(key)){
            objectMap.put(key, instance);
        }
    }

    public static Object getService(String key){
        return objectMap.get(key);
    }
}
