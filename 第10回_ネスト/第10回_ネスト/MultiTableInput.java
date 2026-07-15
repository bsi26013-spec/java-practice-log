// 第10回 例題4：段をキーボードから入力する版（Scanner）
// 実行例：echo 7 | java MultiTableInput.java
import java.util.Scanner;

class MultiTableInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("何の段を表示しますか。");
        int dan = scanner.nextInt();
        for (int i = 1; i <= 9; i++) {
            System.out.print(dan + "×" + i + "＝" + (dan * i) + " ");
        }
    }
}
