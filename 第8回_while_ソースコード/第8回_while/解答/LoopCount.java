// 第8回 チャレンジ【解答】4つとも kaisu を数えて表示。
// ➀ 10000回 / ➁ 10001回 / ➂ 9998回 / ➃ 9999回
class LoopCount {
    public static void main(String[] args) {
        { int count=1, kaisu=0; while (count<=10000){ count++; kaisu++; } System.out.println("➀ " + kaisu + "回"); }
        { int count=0, kaisu=0; while (count<=10000){ count++; kaisu++; } System.out.println("➁ " + kaisu + "回"); }
        { int count=1, kaisu=0; while (count<9999) { count++; kaisu++; } System.out.println("➂ " + kaisu + "回"); }
        { int count=0, kaisu=0; while (count<9999) { count++; kaisu++; } System.out.println("➃ " + kaisu + "回"); }
    }
}
