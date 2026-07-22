// 第13回 チャレンジ（時間が余ったら）：最小値も同時に求めよう。動く土台です。
// ヒント：仮の最小 min = scores[0] を用意し、より小さい値に出会ったら更新する。
// {80, 75, 90, 60} なら最小は 60。正解は1つではありません。
class SumMaxMin {
    public static void main(String[] args) {
        int[] scores = {80, 75, 90, 60};
        int max = scores[0];
        // TODO: ここに int min = scores[0]; を用意する
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
            // TODO: ここに「より小さければ min を更新」する if を書く
        }
        System.out.println("最大:" + max);
        // TODO: 最小も表示する（最大:90 最小:60 となれば成功）
    }
}
