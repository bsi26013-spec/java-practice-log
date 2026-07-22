// 第14回 サイクル1：キーワードを変えた線形検索。「Python基礎」は何回目で見つかる？
class BookSearch2 {
    public static void main(String[] args) {
        String[] bookTitles = {"Java入門", "Python基礎", "C#プログラミング"};
        int[] bookPrices = {2500, 2200, 2800};
        String searchTitle = "Python基礎";     // 今回は別のキーワード
        boolean isFind = false;

        for(int i = 0; i < bookTitles.length; i++) {
            if (bookTitles[i].equals(searchTitle)) {
                System.out.println(bookPrices[i]);
                isFind = true;
                break;
            }
        }
        if (!isFind) {
            System.out.println("お探しの本はありません");
        }
    }
}
