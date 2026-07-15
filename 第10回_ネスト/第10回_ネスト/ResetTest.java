// 第10回 5. ネストのトレース表と落とし穴（おどろき演習）
// 内側の j は2周目も 0 から？ 前の続き（3）から？
class ResetTest {
    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(j);
            }
            System.out.print(" ");
        }
    }
}
