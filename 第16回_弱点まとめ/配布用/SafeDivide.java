// 第16回 チャレンジ（時間が余ったら）：0除算を防ごう。動く土台です。
// ヒント：割り算の前に if (b == 0) で分岐する。期末でもそのまま問われる形。
class SafeDivide {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        // TODO: b が 0 なら「0では割れません」と表示し、
        //       0 でなければ a / b を表示する
        System.out.println(a / b);      // ← このままだと実行時エラー！
    }
}
