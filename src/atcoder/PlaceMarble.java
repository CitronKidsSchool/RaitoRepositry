package atcoder;

import java.util.Objects;
import java.util.Scanner;

public class PlaceMarble {
    public static void main (String[] a) {
        int counter = 0;
        String s1 = new Scanner(System.in).nextLine();
        String[] s1ary = s1.split("");
        for (String c : s1ary) {
            if (Objects.equals(c, "1")){
                counter += 1;
            }
        }
        System.out.println(counter);
    }
}
