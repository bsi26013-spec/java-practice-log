// 第12回 例題5：入力サイズで配列を作る（Scanner）
// 「5」と入力すると numbers.length は 5 になる。
// 実行例：echo 5 | java SizeInput.java
import java.util.Scanner;

class SizeInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("配列のサイズを入力してください: ");
        int size = Integer.parseInt(sc.nextLine());
        int[] numbers = new int[size];
        System.out.println("要素数: " + numbers.length);
    }
}
