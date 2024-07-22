package com.leetcodegfg;

import java.util.Scanner;

public class ReverseWordsInGivenString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence : ");
        String inputString = sc.nextLine();
        System.out.println(reverseWords(inputString));
    }

    public static String reverseWords(String inputString)
    {
        int left = 0;
        int right = inputString.length() - 1;

        String temp = "";
        String result = "";

        while (left <= right)
        {
            char ch = inputString.charAt(left);
            if (ch != ' ')
            {
                temp += ch;
            }
            else if (ch == ' ')
            {
                if (!result.equals(""))
                {
                    result = temp + " " + result;
                }
                else
                {
                    result = temp;
                }
                temp = "";
            }
            left++;
        }

        if (!temp.equals(""))
        {
            if (!result.equals(""))
            {
                result = temp + " " + result;
            }
            else
            {
                result = temp;
            }
        }
        return result;
    }
}
