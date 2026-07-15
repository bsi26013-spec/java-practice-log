// 第9回 5. for で合計を求める（おどろき演習）
// 合計の入れ物 count はループの外に。0〜4を足すといくつ？
class SumTest {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 5; i++) {
            count += i;                 // 毎回 i を足し込む
        }
        System.out.println(count);
    }
}
