package com.valtech.proj.training.day5;


/*
@@Author: Irfan Ahmad


*/



import java.util.Comparator;
public class PasswordGenerator {
    int count = 0;
   public boolean lower(String str) {
        int flag = 0;
        if (str.length() < 8)
            return false;
        for (char ch = 0; ch < str.length(); ch++) {
            if (Character.isLowerCase(ch)) {
                if (flag == 0) {
                    count += 5;
                    flag = 1;
                    return true;
                } else {
                    break;
                }
            }
        }
        return true;
    }

   public boolean upper(String str) {
        int flag = 0;
        if (str.length() < 8)
            return false;
        for (char ch = 0; ch < str.length(); ch++) {
            if (!Character.isLowerCase(ch)) {
                if (flag == 0) {
                    count += 5;
                    flag = 1;
                    return true;
                } else {
                    break;
                }
           }

       }
        return true;
    }

   public boolean digit(String str) {
        int flag = 0;

       for (char ch = 0; ch < str.length(); ch++) {
            if (!Character.isDigit(ch)) {
                if (flag == 0) {
                    count += 5;
                    flag = 1;
                    return true;
                } else {
                    count += 1;
                }
            } else {
                return false;
            }

       }
        return true;
    }

   public boolean specialCharacter(String str) {
       int flag = 0;
       String specialChars = "!@#$%&*()'+,-./:;<=>?[]^_`{|}";
       for (int i = 0; i < str.length(); i++) {
           String strChar = Character.toString(str.charAt(i));
          
           if (specialChars.contains(strChar)) {
               if (flag == 0) {
                   count += 5;
                   flag = 1;
                   return true;
               } else {
                   count += 1;
               }
           }else {
        	   return false;
           }
      }
       return true;
   }
}