// 第13回 サイクル1：1本のループで合計と最大を同時に求める。
// 合計と最大は、それぞれいくつになる？（予想してから実行）
class SumMax {
    public static void main(String[] args) {
        int[] scores = {80, 75, 90, 60};
        int sum = 0;
        int max = scores[0];
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
            if (scores[i] > max) {
                max = scores[i];
            }
        }
        System.out.println("合計:" + sum + " 最大:" + max);
    }
}
