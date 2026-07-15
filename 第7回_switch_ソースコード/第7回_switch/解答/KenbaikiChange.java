// 第7回 チャレンジ【解答例】（正解は1つではありません）
// 番号2・投入金額1000 →「おつりは 520円です」
import java.util.Scanner;

class KenbaikiChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("番号を入力：");
        int menu = sc.nextInt();
        System.out.print("投入金額：");
        int pay = sc.nextInt();

        int price = 0;
        switch (menu) {
            case 1: price = 580; System.out.println("ラーメン 580円"); break;
            case 2: price = 480; System.out.println("うどん 480円"); break;
            case 3: price = 500; System.out.println("そば 500円"); break;
            default: System.out.println("その番号はありません");
        }

        if (price > 0) {               // ←【解答】無効な番号(price=0)では計算しない
            System.out.println("おつりは " + (pay - price) + "円です");
        }
    }
}
