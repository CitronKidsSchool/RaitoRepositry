public class Main {
    public static void main(String[] args) {
        boolean isSunny = false;
        if (isSunny){
            System.out.println("washing");
        }else {
            System.out.println("watching DVD");
        }

        int rand = new java.util.Random().nextInt(3)+ 1;
        System.out.println(rand);

        System.out.println("name");
        String abc = new java.util.Scanner(System.in).nextLine();
        System.out.println("HEllo mister " + abc);


        System.out.println("ようこそ占いの館へ");
        System.out.println("あなたの名前を入力してください");
        String name = new java.util.Scanner(System.in).nextLine();
        System.out.println("あなたの年齢を入力してください");
        String ageString = new java.util.Scanner(System.in).nextLine();
        int age =Integer.parseInt(ageString);
        int fortune = new java.util.Random().nextInt(4) + 1;
        String omikuzi = "";
        if (fortune == 1) {
            omikuzi = "大吉";
        }else if (fortune == 2){
            omikuzi = "中吉";
        }else if (fortune == 3){
            omikuzi = "吉";
        }else {
            omikuzi = "凶";
        }
        System.out.println("占いの結果が出ました！！");
        System.out.println(ageString +"歳の" +  name + "さん、あなたの運命は、" + omikuzi + "です！");

    }
}