package com.kw.interview.programs.duplicateCharacter;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class DuplicateCharFromString {
    /**
     * This method helps to execute the program.
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("**** Duplicate Character in String Program *****");
        String str = "Dharmendra";
        System.out.println("**** Duplicate Char is :::" + firstDuplicateChar(str));
        Map<Character, Integer> map = allDuplicateChar(str);
        for (Character ch : map.keySet()) {
            if (map.get(ch) > 1) {
                System.out.println("Duplicate Character is :: " + ch + " Times " + map.get(ch));
            }
        }
    }

    public static Character firstDuplicateChar(String str) {
        boolean[] count = new boolean[26];
        for (int i = 0; i < str.length(); i++) {
            int asciiCode = str.toUpperCase().charAt(i) - 64;
            if (!count[asciiCode]) {
                count[asciiCode] = true;
            }
            return (char) charMapping().get(i);
        }
        return null;
    }

    public static Map<Character, Integer> allDuplicateChar(String str) {
        Map<Character, Integer> map = new LinkedHashMap();
        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        return map;
    }

    private static Map charMapping() {
        Map map = new HashMap();
        map.put(0, 'a');
        map.put(1, 'b');
        map.put(2, 'c');
        map.put(3, 'd');
        map.put(4, 'e');
        map.put(5, 'f');
        map.put(6, 'g');
        map.put(7, 'h');
        map.put(8, 'i');
        map.put(9, 'j');
        map.put(10, 'k');
        map.put(11, 'l');
        map.put(12, 'm');
        map.put(13, 'n');
        map.put(14, 'o');
        map.put(15, 'p');
        map.put(16, 'q');
        map.put(17, 'r');
        map.put(18, 's');
        map.put(19, 't');
        map.put(20, 'u');
        map.put(21, 'v');
        map.put(22, 'w');
        map.put(23, 'x');
        map.put(24, 'y');
        map.put(25, 'z');
        return map;
    }
}
