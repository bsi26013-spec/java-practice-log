// 第7回 演習【解答】空欄➀を埋めた完成形。番号2で「ご注文：うどん 480円」。
import java.util.Scanner;

class Kenbaiki {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("番号を入力：");
        int menu = sc.nextInt();
        System.out.print("ご注文：");
        switch (menu) {
            case 1:
                System.out.println("ラーメン 580円");
                break;
            case 2:
                System.out.println("うどん 480円");   // ←【解答】
                break;                                 // ←【解答】
            case 3:
                System.out.println("そば 500円");
                break;
            default:
                System.out.println("その番号はありません");
        }
    }
}
