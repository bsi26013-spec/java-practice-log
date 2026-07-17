// 第11回 4. continue 文（おどろき演習）
// i==3 で continue。表示は 1〜5 のうちどれ？ 途中で止まる？
class ContinueBasic {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            if (i == 3) {
                continue;           // i が 3 のときだけ、下の print を飛ばす
            }
            System.out.print(i + " ");
        }
    }
}
