package com.leetcodegfg;

import java.util.HashSet;
import java.util.Set;

public class UnionOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] numbers1 = {1,2,3,4,5,6,7,8,9,10};
        int[] numbers2 = {2,3,4,4,5,11,12};
        Set<Integer> unionSet = findUnion(numbers1, numbers2);
        for(int value : unionSet){
            System.out.print(value + " ");
        }

    }

    public static Set<Integer> findUnion(int[] numbers1, int[] numbers2){
        Set<Integer> unionSet = new HashSet<>();
        for(int number : numbers1){
            unionSet.add(number);
        }
        for(int number : numbers2){
            unionSet.add(number);
        }
        return unionSet;
    }



}
