// 第15回 本丸2：拡張for。word には何が入る？ 出力は？
class ForEachBasic {
    public static void main(String[] args) {
        String[] words = {"Hello", "World"};
        for (String word : words) {        // words の要素を1つずつ word へ
            System.out.print(word + " ");
        }
    }
}
