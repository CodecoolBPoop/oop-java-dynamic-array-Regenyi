package com.codecool.dynamicArrayDojo;

import java.util.ArrayList;


public class DynamicIntArray {

    public int[] array;
    ArrayList<Integer> arrayList = new ArrayList();

    DynamicIntArray() {
        System.out.println("arr" + arrayList);
    }

    DynamicIntArray(int num) {
        array = new int[num];
    }

    public Integer[] add(int x) {
        arrayList.add(x);
        Integer [] res = arrayList.toArray(new Integer[arrayList.size()]);
        return res;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i < arrayList.size(); i++) {
            sb.append(' ');
            sb.append(arrayList.get(i));
        }
        return sb.toString();
    }
}
