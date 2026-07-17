// 第12回 5. 範囲外エラー（おどろき演習）
// nums[5] は（ア）0 が出る／（イ）実行時エラー、どちら？
// ※このファイルはわざと ArrayIndexOutOfBoundsException で落ちる教材です。
class OutOfRange {
    public static void main(String[] args) {
        int[] nums = new int[5];        // 添字は 0〜4
        System.out.println(nums[5]);    // 範囲外！
    }
}
