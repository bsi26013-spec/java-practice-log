// 第10回 2. 出力の行数・個数を数える（おどろき演習）
// 内側の条件が j < i（外側の i に連動）。何行・どんな形？
class TriangleTest {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 0; j < i; j++) {   // 内側の回数が i に連動
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
