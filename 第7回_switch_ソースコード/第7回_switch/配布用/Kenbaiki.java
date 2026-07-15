// 第7回 演習：券売機。番号を入れると商品名と値段が出る。
// 【穴埋め】空欄➀に、case 2 のとき「うどん 480円」を表示して break でぬける2行を書こう。
// （Scanner は未習の道具。丸暗記は不要。真似すれば大丈夫。）
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
                // ➀ここに2行：うどん 480円 を表示して break
                System.out.println("うどん 480円");
                break;
            case 3:
                System.out.println("そば 500円");
                break;
            default:
                System.out.println("その番号はありません");
        }
    }
}
