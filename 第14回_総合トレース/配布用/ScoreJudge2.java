// 第14回 本丸2：成績の選択出力を新しい値で。80 は >= 80 に含まれる？
// どの人が表示される？（予想してから実行）
class ScoreJudge2 {
    public static void main(String[] args) {
        int[] scores = {75, 92, 58, 80, 44};
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= 80) {
                System.out.print((i + 1) + "人目：合格 ");
            } else if (scores[i] < 60) {
                System.out.print((i + 1) + "人目：再テスト ");
            } else {
                System.out.print((i + 1) + "人目：要努力！");
            }
        }
    }
}
