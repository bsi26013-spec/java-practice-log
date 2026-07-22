// 第15回 つかみ：実行時引数はどう届く？ args[0] は数？ 文字列？
// 実行例：java Show.java 10 20 30
class Show {
    public static void main(String[] args) {
        System.out.println(args[0]);      // 最初の実行時引数
        System.out.println(args.length);  // 引数の個数
    }
}
