// 第16回 本丸：int の0除算。コンパイルは通る？ 実行はどうなる？
// ※このファイルはわざと実行時エラーになる教材です（ArithmeticException）。
class ZeroDiv {
    public static void main(String[] args) {
        int x = 5;
        int y = 0;
        System.out.println(x / y);      // 0で割るとどうなる？
    }
}
