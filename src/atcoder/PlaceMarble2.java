package atcoder;

import java.util.Objects;
import java.util.Scanner;

public class PlaceMarble2 {
    public static void main (String[] a) {
        int counter = 0;
        int x = new Scanner(System.in).nextInt();
        for (int i = 0; i < 3;  i++){
            if (x % 10 == 1){
                counter += 1;
            }
            x /= 10;

        }
        System.out.println(counter);
    }
}
