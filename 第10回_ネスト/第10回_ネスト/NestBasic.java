// 第10回 1. 二重ループ（ネスト）の仕組み（おどろき演習）
// マス (i,j) は全部で何個？ 何行？（外3×内2）
class NestBasic {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {          // 外側（行）：3回
            for (int j = 0; j < 2; j++) {      // 内側（列）：2回
                System.out.print("(" + i + "," + j + ") ");
            }
            System.out.println();               // 1行ぶん出したら改行
        }
    }
}
