// 第7回 サイクル1【解答】case 2 に break を書き足した完成形。出力は「お茶」だけ。
class FallThrough {
    public static void main(String[] args) {
        int menu = 2;
        switch (menu) {
            case 1:
                System.out.print("コーヒー");
                break;
            case 2:
                System.out.print("お茶");
                break;                 // ←【解答】これを書き足す
            case 3:
                System.out.print("ジュース");
                break;
        }
        System.out.println();
    }
}
