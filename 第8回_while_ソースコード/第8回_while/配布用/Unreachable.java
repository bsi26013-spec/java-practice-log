// 第8回 回収：while(true) の後ろに処理を書いた。動く？ コンパイルエラー？
// ※このファイルはわざとエラーになる教材です（到達不能コード）。
class Unreachable {
    public static void main(String[] args) {
        while (true) {
            System.out.println("回り続ける");
        }
        System.out.println("ここには来られない");   // ← 到達不能コード
    }
}
