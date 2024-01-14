public class DecThree3 {
    public static void main(String[] args){
        for (int i = 0; i < 5; i++) {
            System.out.print("1.検索 2.登録 3.削除 4. 変更 5. 終了" );
            int serected = new java.util.Scanner(System.in).nextInt();
            switch (serected) {
                case 1:
                    System.out.println("検索します");
                    break;
                case 2:
                    System.out.println("登録します");
                    break;
                case 3:
                    System.out.println("削除します");
                    break;
                case 4:
                    System.out.println("変更します");
                    break;
                case 5:
                    System.out.println("終了します");
                    System.exit(0);
                    break;
                default:
                    System.out.println("    ");
                    break;
            }
        }
    }
}
