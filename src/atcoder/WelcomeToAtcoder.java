package atcoder;

import java.util.Scanner;

public class WelcomeToAtcoder {
    public static void main(String[] args){
        int a;
        int b;
        int c;
        String s;
        a = new Scanner(System.in).nextInt();
        Scanner bc = new Scanner(System.in);
        b = bc.nextInt();
        c = bc.nextInt();
        s = new Scanner(System.in).nextLine();
        System.out.println(a + b + c + " " + s);
    }
}
