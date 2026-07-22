// 第13回 応用：3本の配列（アーティスト・アルバム・在庫）を同じ添字でそろえた検索。
// keyword は「Beatles」。何が出る？
class MusicSearch {
    public static void main(String[] args) {
        String[] artists = {"Beatles", "Queen", "Adele"};
        String[] albums = {"Abbey Road", "A Night at the Opera", "25"};
        int[] stocks = {5, 3, 10};
        String keyword = "Beatles";
        boolean found = false;
        for (int i = 0; i < artists.length; i++) {
            if (artists[i].equals(keyword)) {         // equals で照合
                System.out.print("アーティスト名：" + artists[i] + " ");
                System.out.print("アルバム名：" + albums[i] + " ");
                System.out.print("在庫数：" + stocks[i] + "枚");
                found = true;
            }
        }
        if (!found) {
            System.out.print("該当商品はありません。");
        }
    }
}
