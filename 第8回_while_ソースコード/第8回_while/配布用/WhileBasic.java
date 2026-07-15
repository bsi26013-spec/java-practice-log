// 第8回 つかみ：count は 0 から。画面に何が出る？
// 「1 2 3」？ それとも「0 1 2」？ 頭の中で予想してから実行しよう。
class WhileBasic {
    public static void main(String[] args) {
        int count = 0;
        while (count < 3) {
            System.out.print(count + " ");
            count++;
        }
        System.out.println();
    }
}
