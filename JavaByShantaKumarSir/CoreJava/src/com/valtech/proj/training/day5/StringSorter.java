package com.valtech.proj.training.day5;


/*
@@Author: Irfan Ahmad


*/

import java.util.Comparator;



public class StringSorter implements Comparator<String> {
    private int isLength(String s2) {
        return s2.length();
    }



   // length of string
    // vowel count
    // based on alphabetic order



   @Override
    public int compare(String o1, String o2) {
        int si1 = isLength(o1);
        int si2 = isLength(o2);

       if (si1 == si2) {
            return 0;
        }
        if (si1 < si2) {
            return -1;
        }
        return +1;
    }



   private int vowelCount(String s3) {
        String vowels = "AaEeIiOoUu";
        int count = 0;
        for (int i = 0; i < s3.length(); i++) {
            char s4 = s3.charAt(i);
            if (vowels.contains("" + s4)) {
                count++;
            }
        }
        return count;
    }



   public int AlphabeticOrder(String o1, String o2) {
        int si1 = isLength(o1);
        int si2 = isLength(o2);



       int v1 = vowelCount(o1);
        int v2 = vowelCount(o2);



       if (si1 == si2) {
            if (v1 < v2)
                return -1;
            if (v1 == v2) {
                return (o1.compareTo(o2));
            }
            return +1;
        }
        if (si1 < si2) {
            return -1;
        }

       return +1;
    }
}





