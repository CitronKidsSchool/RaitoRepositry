import java.util.Scanner;

public class Sum {
    public static void main(String [] agrs){
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        scn = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += scn.nextInt();
        }
        System.out.println(sum);
    }
}
