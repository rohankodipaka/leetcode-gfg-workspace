package com.leetcodegfg;

import java.util.Scanner;

public class RotateArrayByKelements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = {1,2,3,4,5,6,7};
        int numbersLength = numbers.length;
        System.out.println("Enter the value of K : ");
        int k = sc.nextInt();

        rotateArrayToRightByK(numbers, numbersLength, k);
        System.out.println("After Rotating the k elements to right");
        for(int elements : numbers){
            System.out.print(elements + " ");
        }

        System.out.println();

        numbers = new int[]{1, 2, 3, 4, 5, 6, 7};
        rotateArrayToLeftByK(numbers, numbersLength, k);
        System.out.println("After Rotating the k elements to left");
        for(int elements : numbers){
            System.out.print(elements + " ");
        }

    }

    public static void rotateArrayToRightByK(int[] numbers, int numbersLength, int k){
        reverse(numbers, 0, numbersLength-k-1);
        reverse(numbers, numbersLength-k, numbersLength-1);
        reverse(numbers, 0, numbersLength-1);
    }

    public static void rotateArrayToLeftByK(int[] numbers, int numbersLength, int k){
        reverse(numbers, 0, k-1);
        reverse(numbers, k, numbersLength-1);
        reverse(numbers, 0, numbersLength-1);
    }

    public static void reverse(int[] numbers, int start, int end){
        while (start <= end){
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }
    }


}
