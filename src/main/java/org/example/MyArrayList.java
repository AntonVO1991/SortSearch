package org.example;

import java.util.Arrays;
import java.util.Comparator;

public class MyArrayList<T> {
    static int binarySearch(byte[] a, byte key) {
        Arrays.sort(a);
        return Arrays.binarySearch(a, key);
    }

    static int binarySearch(byte[] a, int fromIndex, int toIndex, byte key) {
        Arrays.sort(a, fromIndex, toIndex);
        return Arrays.binarySearch(a, fromIndex, toIndex, key);
    }

    static int binarySearch(char[] a, char key) {
        Arrays.sort(a);
        return Arrays.binarySearch(a, key);
    }

    static int binarySearch(char[] a, int fromIndex, int toIndex, char key) {
        Arrays.sort(a, fromIndex, toIndex);
        return Arrays.binarySearch(a, fromIndex, toIndex, key);
    }

    static int binarySearch(double[] a, double key) {
        Arrays.sort(a);
        return Arrays.binarySearch(a, key);
    }

    static int binarySearch(double[] a, int fromIndex, int toIndex, double key) {
        Arrays.sort(a, fromIndex, toIndex);
        return Arrays.binarySearch(a, fromIndex, toIndex, key);
    }

    static int binarySearch(User[] a, User key, Comparator<User> c) {
        Arrays.sort(a, c);
        return Arrays.binarySearch(a, key, c);
    }

    static int binarySearch(User[] a, int fromIndex, int toIndex, User key, Comparator<User> c) {
        Arrays.sort(a, fromIndex, toIndex, c);
        return Arrays.binarySearch(a, fromIndex, toIndex, key, c);
    }

    static int binarySearch(float[] a, float key) {
        Arrays.sort(a);
        return Arrays.binarySearch(a, key);
    }

    static int  binarySearch(float[] a, int fromIndex, int toIndex, float key)  {
        Arrays.sort(a, fromIndex, toIndex);
        return Arrays.binarySearch(a, fromIndex, toIndex, key);
    }

    static int binarySearch(long[] a, long key) {
        Arrays.sort(a);
        return Arrays.binarySearch(a, key);
    }

    static int binarySearch(long[] a, int fromIndex, int toIndex, long key)  {
        Arrays.sort(a, fromIndex, toIndex);
        return Arrays.binarySearch(a, fromIndex, toIndex, key);
    }

    static int binarySearch(short[] a, short key) {
        Arrays.sort(a);
        return Arrays.binarySearch(a, key);
    }

    static int binarySearch(short[] a, int fromIndex, int toIndex, short key)  {
        Arrays.sort(a, fromIndex, toIndex);
        return Arrays.binarySearch(a, fromIndex, toIndex, key);
    }

    public static int binarySearch(int[] a, int key)  {
        Arrays.sort(a);
        return Arrays.binarySearch(a, key);
    }
}