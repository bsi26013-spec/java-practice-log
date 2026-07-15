// 第8回 チャレンジ（頭の体操）：それぞれ何回繰り返す？
// まず頭の中で予想 → そのあと kaisu を数える1行を足して実行し、答え合わせをしよう。
// ➀は例として完成させてあります。➁➂➃も同じように書いて確かめよう。
class LoopCount {
    public static void main(String[] args) {

        // ➀ int count=1; while(count<=10000) count++;  → 何回?
        {
            int count = 1;
            int kaisu = 0;
            while (count <= 10000) { count++; kaisu++; }
            System.out.println("➀ " + kaisu + "回");
        }

        // ➁ int count=0; while(count<=10000) count++;  → 何回?
        {
            int count = 0;
            int kaisu = 0;
            while (count <= 10000) { count++; /* ここに kaisu++ */ }
            // System.out.println("➁ " + kaisu + "回");
        }

        // ➂ int count=1; while(count<9999) count++;   → 何回?
        {
            int count = 1;
            int kaisu = 0;
            while (count < 9999) { count++; /* ここに kaisu++ */ }
            // System.out.println("➂ " + kaisu + "回");
        }

        // ➃ int count=0; while(count<9999) count++;   → 何回?
        {
            int count = 0;
            int kaisu = 0;
            while (count < 9999) { count++; /* ここに kaisu++ */ }
            // System.out.println("➃ " + kaisu + "回");
        }
    }
}
