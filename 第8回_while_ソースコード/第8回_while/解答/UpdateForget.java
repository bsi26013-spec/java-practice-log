// 第8回 サイクル1【解答】num を 2 ずつ増やす。出力は「1 3 」。
class UpdateForget {
    public static void main(String[] args) {
        int num = 1;
        while (num <= 3) {
            System.out.print(num + " ");
            num = num + 2;              // ←【解答】1→3→5 で終了
        }
        System.out.println();
    }
}
