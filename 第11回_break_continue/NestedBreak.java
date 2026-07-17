// 第11回 5. ネストの break（おどろき演習）
// 内側で j==1 になったら break。外側は止まる？ 止まらない？
class NestedBreak {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 1) {
                    break;              // 内側だけ抜ける
                }
                System.out.print(i + "" + j + " ");
            }
        }
    }
}
