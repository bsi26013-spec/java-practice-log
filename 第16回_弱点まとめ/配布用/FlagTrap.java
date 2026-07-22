// 第16回 応用：flag は false 始まり。出力は「完了」？「未完」？
// ヒント：= が1つしか無いことに注目（代入？ 比較？）
class FlagTrap {
    public static void main(String[] args) {
        boolean flag = false;
        if (flag = true) {
            System.out.print("完了");
        } else {
            System.out.print("未完");
        }
    }
}
