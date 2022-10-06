package com.valtech.proj.training.day5;

/*
@@Author: Irfan Ahmad


*/


import static org.junit.Assert.*;
import java.util.Arrays;
import org.junit.Test;

public class StringSorterTest {



   @Test
    public void testAlphabeticOrder() {
        String[] names = { "Abc", "Pqr", "Lmno", "Too", "Ab", "z" };
        Arrays.sort(names, new StringSorter());
        assertArrayEquals(new String[] { "z", "Ab", "Abc", "Pqr", "Too", "Lmno" }, names);
    }



   @Test
    public void testVowelCount() {
        String[] names = { "Abc", "Pqr", "Lmno", "Too", "Ab", "z" };
        Arrays.sort(names, new StringSorter());
        assertArrayEquals(new String[] { "z", "Ab", "Abc", "Pqr", "Too", "Lmno" }, names);



   }



   @Test
    public void testLength() {
        String[] names = { "Abc", "Pqr", "Lmno", "Ab", "z" };
        Arrays.sort(names, new StringSorter());
        assertArrayEquals(new String[] { "z", "Ab", "Abc", "Pqr", "Lmno" }, names);
    }



}