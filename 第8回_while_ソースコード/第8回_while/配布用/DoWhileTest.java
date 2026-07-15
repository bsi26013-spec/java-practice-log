// 第8回 do while：n は 10、条件 n < 5 は最初から false。何回実行される？
// 0回？ 1回？ 予想してから実行しよう。
class DoWhileTest {
    public static void main(String[] args) {
        int n = 10;
        do {
            System.out.println("1回は実行される: " + n);
            n++;
        } while (n < 5);        // 最初から条件は false
    }
}
