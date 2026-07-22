class BookSearchPractice {
    public static void main(String[] args) {
        String[] bookTitles = {"Java入門", "Python基礎", "C#プログラミング", "ruby基礎", "Java入門1", "Java入門2"};
        int[] bookPrices = {2000, 2200, 2800, 10000, 2900, 2600};
        String searchTitle = "Java入門";
        boolean isFind = false;
        int min = 100000;

        for (int i = 0; i < bookTitles.length; i++) {
            if (bookTitles[i].equals(searchTitle)) {
                System.out.println("見つかりました");
                System.out.println(i + 1 + "個目の本です。");
                System.out.print(bookPrices[i] + "円");
                System.out.println();
                int Book = bookPrices[i];
                if (Book < min) {
                    min = Book;
                }
                isFind = true;
                break;
            }
        }
        if (!isFind) {
            System.out.print("該当する本はありません。");
        } else {
            System.out.println("最小価格: " + min + "円");
        }
    }
}
