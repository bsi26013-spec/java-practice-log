// 第9回 3. 0から数える・回数の数え方（おどろき演習）
// i < 3 は3個だった。i <= 3 では何個出る？
class CountTest {
    public static void main(String[] args) {
        for (int i = 0; i <= 9; i++) {      // < ではなく <=
        		if (i % 2 == 0) { // 偶数だけ出力
        	System.out.print(i + " ");
        		}
        }
    }
}
