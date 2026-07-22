// 第14回 チャレンジ（時間が余ったら）：70 が何個あるか数えよう。動く土台です。
// ヒント：break せずに最後まで回り、一致するたびにカウンタを増やす。答えは3個。
class CountMatch {
    public static void main(String[] args) {
        int[] data = {70, 85, 70, 90, 70};
        int target = 70;
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            // TODO: data[i] が target と一致したら count を増やす
        }
        System.out.println(target + " は " + count + " 個");
    }
}
