// 第13回 つかみ："Java" は4文字。出力は「長い」「短い」のどちら？
class LengthJudge {
    public static void main(String[] args) {
        String input = "Java";
        if (input.length() > 3) {
            System.out.println("長い");
        } else {
            System.out.println("短い");
        }
    }
}
