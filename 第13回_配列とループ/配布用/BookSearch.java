// 第13回 本丸：本のタイトルから価格を線形検索。searchTitle は「Java入門」。
// 何が出力される？ 配列を全部見る？（予想してから実行）
class BookSearch {
    public static void main(String[] args) {
        String[] bookTitles = {"Java入門", "Python基礎", "C#プログラミング"};
        int[] bookPrices = {2500, 2200, 2800};
        String searchTitle = "C#プログラミング";
        boolean isFind = false;
        for (int i = 0; i < bookTitles.length; i++) {
            if (bookTitles[i].equals(searchTitle)) {
                System.out.print(bookPrices[i]);
                isFind = true;
                break;
            }
        }
        if (!isFind) {
            System.out.print("該当する本はありません。");
        }
    }
}
