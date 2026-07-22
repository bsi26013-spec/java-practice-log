// 第15回 チャレンジ【解答例】（正解は1つではありません）
class SumArgs {
    public static void main(String[] args) {
        int sum = 0;
        for (String s : args) {               // ←【解答】引数を1つずつなぞる
            sum += Integer.parseInt(s);       //   数値化して足し込む
        }
        System.out.println(sum);              // java SumArgs 10 20 30 40 → 100
    }
}
