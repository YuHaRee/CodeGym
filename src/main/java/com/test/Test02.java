package main.java.com.test;
import java.util.Scanner;

// a와 b 출력하기
// -100,000 ≤ a, b ≤ 100,000

public class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a>= -100000 && b<=100000)
            System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}

