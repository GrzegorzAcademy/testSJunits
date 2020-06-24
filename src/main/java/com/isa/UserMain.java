package com.isa;

import com.isa.sorter.MapSorter;
import com.isa.user.User;

import java.util.HashMap;
import java.util.Map;

public class UserMain {

    public static void main(String[] args) {

        User user = new User("janko");

        System.out.println(user);

        user.setPassword("my-password");

        System.out.println(user);

        Map<Integer, String> inputMap = new HashMap<>();
        inputMap.put(3, "a");
        inputMap.put(1, "c");
        inputMap.put(2, "b");
//        MapSorter.sortByKey(inputMap);
        System.out.println(MapSorter.sortByKey(inputMap));
    }
}
