package com.leetcodegfg;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find its index : ");
        int number = sc.nextInt();
        System.out.println(searchElementIndex(numbers, number));
    }

    public static int searchElementIndex(int[] numbers, int number){
        int index = -1;
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == number){
                index = i;
            }
        }
        return index;
    }

}
