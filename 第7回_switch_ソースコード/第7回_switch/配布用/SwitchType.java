// 第7回 本丸：boolean を switch に渡している。
// これは動く？ 予想（ア「真」と表示／イ コンパイルエラー）してから実行しよう。
// ※このファイルはわざとエラーになる教材です（switch に boolean は使えない）。
class SwitchType {
    public static void main(String[] args) {
        boolean flag = true;
        switch (flag) {              // ← boolean は switch の条件に使えない
            case true:
                System.out.println("真");
                break;
        }
    }
}
