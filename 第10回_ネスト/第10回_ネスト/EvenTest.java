// 第10回 3. for の中の if（条件で絞る）（おどろき演習）
// 10回まわる。表示されるのは何個？
class EvenTest {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {               // 偶数だけ
                System.out.print(i + " ");
            }
        }
    }
}
