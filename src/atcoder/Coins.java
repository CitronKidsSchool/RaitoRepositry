package atcoder;

import org.w3c.dom.css.Counter;

import java.util.Scanner;

public class Coins {
    public static void main (String[] args) {
        int a;
        int b;
        int c;
        int x;
        int Counter = 0;
        a = new Scanner(System.in).nextInt();
        b = new Scanner(System.in).nextInt();
        c = new Scanner(System.in).nextInt();
        x = new Scanner(System.in).nextInt();
        for (int i = 0; i <= a;  i++){
            for (int j = 0; j <= b;  j++){
                for (int k = 0; k <= c;  k++){
                    System.out.println(500 * i + " , " + 100 * j + " , " + 50 * k );
                    if (x == 500 * i + 100 * j + 50 * k){
                        Counter += 1;
                    }
                }
            }
        }
        System.out.println(Counter);



    }
}
