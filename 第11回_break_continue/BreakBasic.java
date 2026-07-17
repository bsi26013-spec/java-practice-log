// 第11回 1. break 文の基本（おどろき演習）
// 1〜10 の予定。どこまで表示される？（i==4 で break）
class BreakBasic {
    public static void main(String[] args) {
    		int count = 0;
        for (int i = 1; i <= 10; i++) {
            if (i == 4) {
            		count = i;
                break;              // i が 4 になったら即終了
            }
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(count + "でbreak");
    }
}
