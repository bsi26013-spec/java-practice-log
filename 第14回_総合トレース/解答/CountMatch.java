// 第14回 チャレンジ【解答例】（正解は1つではありません）
class CountMatch {
    public static void main(String[] args) {
        int[] data = {70, 85, 70, 90, 70};
        int target = 70;
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {       // ←【解答】一致するたびに数える
                count++;                   //   （件数を数えるので break しない）
            }
        }
        System.out.println(target + " は " + count + " 個");   // 70 は 3 個
    }
}
