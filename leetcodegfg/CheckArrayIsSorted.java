package com.leetcodegfg;

public class CheckArrayIsSorted {
    public static void main(String[] args) {
        int[] numbers = {1,2,8,4,5};
        System.out.println(checkIfArrayIsSorted(numbers)); //Brute Force Approach(Using two for loops)
        System.out.println(isSorted(numbers)); //Optimal Approach(Single Traversal)
    }

    public static boolean checkIfArrayIsSorted(int[] numbers){

        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j< numbers.length; j++){
                if(numbers[j] < numbers[i]){
                    return false;
                }
            }
        }
        return true;
    }

    /*Time Complexity - O(N^2)
      Space Complexity - O(1)
     */
//---------------------------------------------------------------
    public static boolean isSorted(int[] numbers){
        for(int i=1; i< numbers.length; i++){
            if(numbers[i] < numbers[i-1]){
                return false;
            }
        }
        return true;
    }

    /*Time Complexity  - O(N)
      Space Complexity - O(1)
     */

}
