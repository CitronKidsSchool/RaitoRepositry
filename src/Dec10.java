import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

import static java.lang.System.in;

public class Dec10
{
    public static void main(String[] args){
    System.out.println("数あてゲーム");
    int ans = new Random().nextInt(10);
    for (int i = 0; i < 5; i++){
        System.out.println("０～９の数字を表示してください");
        int num;
        try {
            num = new Scanner(System.in).nextInt();
        } catch (InputMismatchException e) {
            System.out.println("もう一度入力してください");
            i--;
            continue;
        }
        if (num < 0 || num > 9){
            System.out.println("０～９の間で入力してください");
            i--;
            continue;
        }
        if (num == ans){
            System.out.println("アタリ！");
            break;
        }else{
            System.out.println("違います");
        }
    }
    System.out.println("ゲームを終了します");

}
}
