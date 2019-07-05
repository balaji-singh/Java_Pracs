package com.masterjavaonline.core.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

    public static void main(String[] args) {

        Map<String, Integer> m = new HashMap<String, Integer>(20);

        System.out.println(m.put("Bala", 101));

        System.out.println(m.put("Bala S Singh", 102));
        System.out.println(m.values());
        System.out.println(m.containsKey("Bala"));
        System.out.println(m.entrySet());

        float f = 1.2f;
        System.out.println(f);
        double d = 1.2d;
        System.out.println(d);
        // int i;
        // System.out.println("" + i);
    }

}