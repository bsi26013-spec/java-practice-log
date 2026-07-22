// 第16回 つかみ：保存＝反映ではない実験。
// 手順：javac Exp.java → java Exp → 下の文字を書き換えて保存だけ → もう一度 java Exp
// 新しい文字が出る？ 古いまま？（java が動かすのは直前に javac が作った .class）
class Exp {
    public static void main(String[] args) {
        System.out.println("こんにちは");   // ← ここを書き換えて実験する
    }
}
