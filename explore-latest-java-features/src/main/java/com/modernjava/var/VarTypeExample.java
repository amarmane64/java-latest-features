package com.modernjava.var;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class VarTypeExample {


    //var in the class properties are not allowed.
    //private var x = "abc";

    public static void main(String[] args) {
        var listUsers = List.of("amar", "kashvi", "snehal");
        System.out.println("LIST : " + listUsers);

        var map = Map.ofEntries(Map.entry("a", List.of("Amar", "Abhijeet")),
                Map.entry("k", List.of("KASHVI")));
        System.out.println("map: " + map);

        for (var name : listUsers) {
            System.out.println("NAME: " + name);
        }
        map.forEach((s, strings) -> {
            System.out.println(s + " : " + strings);
        });

       var transformedName = transform("aaaaaaa");
        System.out.println(transformedName);
    }

    static String transform(String name) { // var in the function argument is not allowed
        return name.toUpperCase();

    }

}

