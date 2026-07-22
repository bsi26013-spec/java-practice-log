// 第15回 本丸1：数字でない引数を parseInt すると？
// 実行例：java Program.java abc （→ 実行時エラーになる教材です）
//         java Program.java 5   （→ 15）
class Program {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        System.out.println(number + 10);
    }
}
