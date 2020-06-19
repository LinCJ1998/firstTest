package org.example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main2 {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap();
        map.put("a","aa");
        map.put("b","bb");
        map.put("c","cc");
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> entry = iterator.next();
            entry.setValue("dd");
        }
        System.out.println(map);
    }
}
