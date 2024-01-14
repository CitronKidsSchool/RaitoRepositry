package atcoder;

import java.util.Scanner;

public class Product {
    public static void main(String[] agrs){
       int a;
       int b;
       Scanner ab = new Scanner(System.in);
       a = ab.nextInt();
       b = ab.nextInt();
       if (a * b % 2 == 1){
           System.out.println("Odd");
       }else {
           System.out.println("Even");
       }
    }
}
