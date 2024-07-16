package com.leetcodegfg;

import java.util.HashSet;

public class RemoveDuplicatedFromSortedArray {
    public static void main(String[] args) {
        int[] numbers = {1,1,2,2,2,3,3};
        HashSet<Integer> set = new HashSet<>();
        System.out.println(removeDuplicates(numbers, set)); //Brute Force approach(HashSet)
        int size = removeDuplicates(numbers); //Optimal approach(Two pointer technique)
        System.out.println("The array after removing duplicate elements is ");
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    public static HashSet<Integer> removeDuplicates(int[] numbers, HashSet<Integer> set){
        for(int i=0; i< numbers.length; i++){
            set.add(numbers[i]);
        }
        return set;
    }

//-------------------------------------------------------------------------------------------

    public static int removeDuplicates(int[] numbers){
        int i=0;
        for(int j=1; j< numbers.length; j++){
            if(numbers[i] != numbers[j]){
                i++;
                numbers[i] = numbers[j];
            }
        }
        return i+1;
    }

}
