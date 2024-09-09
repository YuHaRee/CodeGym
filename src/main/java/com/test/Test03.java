package main.java.com.test;
import java.util.Scanner;

// 문자열 반복해서 출력하기

public class Test03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        System.out.println(str.repeat(n));
    }
}

