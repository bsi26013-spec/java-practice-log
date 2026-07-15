// 第8回 本丸：配列 data から target(7) を探す。
// ループが終わったとき found は true？ false？ 予想してから実行しよう。
class FlagTest {
    public static void main(String[] args) {
        int[] data = {3, 7, 5};
        int target = 7;
        boolean found = false;          // フラグ：まだ見つかっていない
        int i = 0;
        while (i < data.length) {
            if (data[i] == target) {
                found = true;           // 見つけたら旗を立てる
            }
            i++;
        }
        if (found) {
            System.out.println("見つかった");
        } else {
            System.out.println("見つからない");
        }
    }
}
