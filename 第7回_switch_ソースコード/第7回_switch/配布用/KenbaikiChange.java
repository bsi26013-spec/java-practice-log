// 第7回 チャレンジ（時間が余ったら）：おつり計算。動く土台です。
// 商品の値段を price に入れておき、投入金額 pay とのおつりを表示しよう。
// ヒント：無効な番号（price が 0 のまま）のときはおつりを計算しない工夫を。
// 正解は1つではありません。
import java.util.Scanner;

class KenbaikiChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("番号を入力：");
        int menu = sc.nextInt();
        System.out.print("投入金額：");
        int pay = sc.nextInt();

        int price = 0;                 // 値段（初期値0＝無効）
        switch (menu) {
            case 1: price = 580; System.out.println("ラーメン 580円"); break;
            case 2: price = 480; System.out.println("うどん 480円"); break;
            case 3: price = 500; System.out.println("そば 500円"); break;
            default: System.out.println("その番号はありません");
        }

        // ↓ ここでおつりを表示しよう（price が 0 より大きいときだけ）
        // TODO: if (price > 0) { ... pay - price ... }
        
        if (price > 0) {
            int Change = pay - price;
            System.out.println("おつり：" + Change + "円");
        }
    }
}
