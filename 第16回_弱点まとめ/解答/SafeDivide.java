// 第16回 チャレンジ【解答例】（正解は1つではありません）
class SafeDivide {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        if (b == 0) {                                   // ←【解答】割る前に確かめる
            System.out.println("0では割れません");
        } else {
            System.out.println(a / b);
        }
    }
}
