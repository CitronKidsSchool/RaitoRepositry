package atcoder;

import java.util.Scanner;

public class A005 {
    public static void main(String[] args){
        long ans = 1;
        int N;
        N = new Scanner(System.in).nextInt();
        for (int i = 1; i <= N;  i++){
            ans *= i;
        }
        System.out.println(ans);
    }

}
