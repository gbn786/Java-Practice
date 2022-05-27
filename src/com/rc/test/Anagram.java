package com.rc.test;

import java.util.HashMap;
import java.util.Map;

/**
 * God = Dog
 * <p>
 * Listen = silent
 */
public class Anagram {

    public static void main(String[] args) {
        String input1 = "listen";
        String input2 = "silennt";
        boolean isAnagram = checkAnagram(input1, input2);
        System.out.println(isAnagram == true ? "Anagram" : "Not");

    }

    private static boolean checkAnagram(String input1, String input2) {
        if (input1.length() != input2.length()) {
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < input1.length(); i++) {
            char c = input1.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        for (int i = 0; i < input2.length(); i++) {
            char c = input2.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) - 1);
            } else {
                map.put(c, -1);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() != 0) {
                return false;
            }
        }
        return true;
    }

}
