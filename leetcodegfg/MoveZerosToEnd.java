package com.leetcodegfg;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] numbers = {1,0,2,3,0,4,0,1};
        int[] numbersAfterPushingZeros= pushZerosToEnd(numbers);
        for(int number : numbersAfterPushingZeros){
            System.out.print(number + " ");
        }
    }

    public static int[] pushZerosToEnd(int[] numbers){

        int j=-1; // pointer j
        for(int i=0; i< numbers.length; i++){
            if(numbers[i] == 0){
                j = i;
                break;
            }
        }

        if(j == -1){
            return numbers;
        }

        for(int i=j+1; i< numbers.length; i++){
            if(numbers[i] != 0){
                int temp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = temp;
                j++;
            }
        }
        return numbers;
    }


}
