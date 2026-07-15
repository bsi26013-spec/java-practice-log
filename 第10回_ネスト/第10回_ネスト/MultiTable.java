// 第10回 4. 掛け算の表（九九）（おどろき演習）
// dan は 7、i は 1〜9。先頭と末尾は？
class MultiTable {
    public static void main(String[] args) {
        int dan = 7;
        for (int i = 1; i <= 9; i++) {
            System.out.print(dan + "×" + i + "＝" + (dan * i) + " ");
        }
    }
}
