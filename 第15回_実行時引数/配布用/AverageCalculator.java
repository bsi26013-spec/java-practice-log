// 第15回 サイクル1：実行時引数の平均。割る数が 3.0 な点に注目。
// 実行例：java AverageCalculator.java 10 20 30 （→ Average: 20.0）
class AverageCalculator {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);
        double average = (num1 + num2 + num3) / 3.0;
        System.out.print("Average: " + average);
    }
}
