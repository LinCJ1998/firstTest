package org.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Map> list = new ArrayList();
        Map<String, String> map1 = new HashMap<String, String>();
        Map<String, String> map2 = new HashMap<String, String>();
        map1.put("key1", "value1");
        map2.put("key1", "value2");
        map1.put("key2", "value3");
        map2.put("key2", "value4");

        list.add(map1);
        list.add(map2);
        List<Map> list2 = new ArrayList();
        for (Map<String, String> map : list) {
            map = (HashMap<String, String>) map.entrySet().stream()
                    .filter(e -> {
                        return e.getKey().equals("key1") && e.getValue().equals("value1");
                    })
                    .collect(Collectors.toMap((e) -> (String) e.getKey(), (e) -> (String) e.getValue()));
            list2.add(map);
        }
        for (Map map : list2) {
            System.out.println(map);
        }

    }
}
