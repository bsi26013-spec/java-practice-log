// 第8回 サイクル1：更新式を消してある。この while は止まる？ 止まらない？
// ★注意：このまま実行すると無限ループです。止めるには Ctrl + C。
// 【穴埋め】空欄➀に「1と3だけを表示して終わる」更新式を書こう（ヒント：2ずつ増やす）。
class UpdateForget {
    public static void main(String[] args) {
        int num = 1;
        while (num <= 3) {
            System.out.print(num + " ");
            // ➀ここに更新式（num を 2 ずつ増やす）
            num += 2;
        }
        System.out.println();
    }
}
