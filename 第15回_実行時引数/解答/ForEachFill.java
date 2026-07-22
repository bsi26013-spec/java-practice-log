// 第15回 穴埋め【解答】空欄➀＝ words（コロンの右はなぞりたい配列そのもの）
class ForEachFill {
    public static void main(String[] args) {
        String[] words = {"Hello", "World"};
        for (String word : words) {        // ←【解答】➀ words
            System.out.print(word + " ");
        }
    }
}
