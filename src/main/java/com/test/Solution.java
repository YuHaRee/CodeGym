package main.java.com.test;

import java.util.Scanner;

// 문자열 출력하기.
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int a = str.length();

        if(a >= 1 && a <= 1000000) {
            System.out.println(str);
        }
    }
}