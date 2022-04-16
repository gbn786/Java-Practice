package com.rc.test;

import java.util.HashMap;
import java.util.Map;

/**
 *
 God = Dog

 Listen = silent
 */
public class Anagram {

    public static void main(String[] args) {
        String input1 = "listen";
        String input2 = "silennt";
        boolean isAnagram = checkAnagram(input1,input2);
        System.out.println(isAnagram==true?"Anagram":"Not");

    }

    private static boolean checkAnagram(String stra, String strb) {
//        d->1,
//        o=>1,
//        g->1;
        //Map of inputA
        Map<Character,Integer> inputMap = new HashMap<>();

        char[] inArray = stra.toCharArray();
        char[] inArray2 = strb.toCharArray();


        for (int i=0; i<inArray.length; i++) {
            if(inputMap.get(inArray[i])!=null) {
                inputMap.put(inArray[i], inputMap.get(inArray[i])+1);
            } else {
                inputMap.put(inArray[i],1);
            }
        }
        //System.out.println(inputMap);

        for (int i=0; i<inArray2.length; i++) {
            if (inputMap.get(inArray2[i])==null || inputMap.get(inArray2[i])==0) {
                return false;
            } else {
                inputMap.put(inArray2[i], inputMap.get(inArray2[i])-1);
            }
        }

        //loop through strB and check if present in Map
        return true;
    }
}
