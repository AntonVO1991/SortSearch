package org.example;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        int[] agesInt = {10, 20, 13, 16, 18, 19, 30};
        byte[] agesB = {10, 20, 13, 16, 18, 19, 30};
        char[] chars = {'a', 'b', 'c', 'd'};
        double[] agesD = {10.0, 20.0, 13.0};
        float[] agesF = {10.0f, 20.0f, 13.0f, 10.0f};
        short[] agesS = {10, 20, 13, 16, 18, 19, 30};
        long[] agesL = {1L, 2L, 3L, 4L, 5L};


        Arrays.sort(agesInt);
        System.out.println("Binary search (int): " + String.valueOf(MyArrayList.binarySearch(agesInt, 18)));


        System.out.println("Binary search (byte): " + MyArrayList.binarySearch(agesB, (byte) 18));
        MyArrayList.binarySearch(agesB, 0, (agesB.length-1), agesB[2]);

        System.out.println("Binary search (char): " + MyArrayList.binarySearch(chars, 'c'));
        MyArrayList.binarySearch(chars, 0, (chars.length-1), chars[2]);

        System.out.println("Binary search (double): " + MyArrayList.binarySearch(agesD, 20.0));
        MyArrayList.binarySearch(agesD, 0, (agesD.length-1), agesD[2]);

        System.out.println("Binary search (float): " + MyArrayList.binarySearch(agesF, 18.0f));
        MyArrayList.binarySearch(agesF, 0, (agesF.length-1), agesF[2]);

        System.out.println("Binary search (short): " + MyArrayList.binarySearch(agesS, (byte) 20));
        MyArrayList.binarySearch(agesS, 0, (agesS.length-1), agesS[2]);

        System.out.println("Binary search (long): " + MyArrayList.binarySearch(agesL, 1L));
        MyArrayList.binarySearch(agesL, 0, (agesL.length-1), agesL[2]);

        User[] users = {
                new User("Alice", 25),
                new User("Bob", 30),
                new User("Charlie", 20)
        };
        Arrays.sort(users);
        System.out.println("Binary search (User): " +
                MyArrayList.binarySearch(users, new User("Bob", 30), new NameComparator()));
        System.out.println("Binary search (User2): " +
        MyArrayList.binarySearch(users, 0, users.length-1, new User("Bob", 30), new NameComparator()));
    }
}