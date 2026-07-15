// 第8回 使い分け比較【while版】同じ処理を while で書くと…
// 「番号を入力」の行が2か所に必要になる点に注目。
// 実行例：printf "2\n3\n0\n" | java MenuWhile.java
import java.util.Scanner;

class MenuWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("番号を入力（0で終了）：");   // ← ループの前に1回
        int n = sc.nextInt();
        while (n != 0) {
            System.out.println(n + "番を承りました");
            System.out.print("番号を入力（0で終了）：");   // ← 同じ行をもう一度
            n = sc.nextInt();
        }
        System.out.println("終了します");
    }
}
