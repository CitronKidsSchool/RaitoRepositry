package atcoder;

import java.util.Scanner;

public class A006 {
    public static void main (String[] args){
        int a1,a2,a3;
        Scanner scn;
        scn = new Scanner(System.in);
        a1 = scn.nextInt();
        a2 = scn.nextInt();
        a3 = scn.nextInt();
        System.out.println((a1 + a2 + a3) % 100);
    }
}
