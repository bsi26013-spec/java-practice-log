// 第11回 3. switch 内の break（おどろき演習）
// case の break は for を止める？ switch だけ？（出力は？）
class SwitchBreak {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            switch (i) {
                case 1:
                    System.out.print("A");
                    break;              // この break は switch を抜ける
                case 2:
                    System.out.print("B");
                    break;
                default:
                    System.out.print("C");
            }
        }
    }
}
