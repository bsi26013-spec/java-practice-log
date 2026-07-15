// 第8回 使い分け比較【do while版】同じ処理を do while で書くと…
// 「番号を入力」の行が1か所にまとまる。「まず1回入力→判定」が自然に書ける。
// 実行例：printf "2\n3\n0\n" | java MenuDoWhile.java
import java.util.Scanner;

class MenuDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("番号を入力（0で終了）：");   // ← 1か所だけ
            n = sc.nextInt();
            if (n != 0) {
                System.out.println(n + "番を承りました");
            }
        } while (n != 0);
        System.out.println("終了します");
    }
}
