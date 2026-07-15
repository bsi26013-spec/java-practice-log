// 第7回 サイクル1：menu は 2。まず実行して、出力を確かめよう。
// そのあと【穴埋め改造】case 2 に break を1行だけ書き足して、もう一度実行しよう。
class FallThrough {
    public static void main(String[] args) {
        int menu = 2;
        switch (menu) {
            case 1:
                System.out.print("コーヒー");
                break;
            case 2:
                System.out.print("お茶");
                // ➀ここに1行追加：switch をぬける命令（break;）
                break;
            case 3:
                System.out.print("ジュース");
                break;
        }
        System.out.println();
    }
}
