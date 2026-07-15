// 第7回 つかみ：まず実行して、予想と照らし合わせよう。
// month は 4。画面に何が出るか、頭の中で予想してから実行しよう。
class SwitchBasic {
    public static void main(String[] args) {
        int month = 111;
        System.out.print("入力されたのは" + month + "月です");
        switch (month) {
            case 3: case 4: case 5:
                System.out.print("春です");
                break;
            case 6: case 7: case 8:
                System.out.print("夏です");
                break;
            default:
                System.out.print("無効な月です");
        }
        System.out.println();
    }
}
