// 第13回 回収：条件を満たした要素だけ出力（選択出力）。
// 60 は「< 60」に含まれる？ どの人が表示される？（予想してから実行）
class ScoreJudge {
    public static void main(String[] args) {
        int[] scores = {85, 72, 49, 90, 60, 45, 78};
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= 80) {
                System.out.print((i + 1) + "人目：よくできました ");
            } else if (scores[i] < 60) {
                System.out.print((i + 1) + "人目：再テストの対象です ");
            }
        }
    }
}
