// 第13回 チャレンジ【解答例】（正解は1つではありません）
class SumMaxMin {
    public static void main(String[] args) {
        int[] scores = {80, 75, 90, 60};
        int max = scores[0];
        int min = scores[0];                  // ←【解答】仮の最小
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
            if (scores[i] < min) {            // ←【解答】より小さければ更新
                min = scores[i];
            }
        }
        System.out.println("最大:" + max + " 最小:" + min);   // 最大:90 最小:60
    }
}
