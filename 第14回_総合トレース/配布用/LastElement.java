// 第14回 回収：length - 1 と length。1行目と2行目はそれぞれどうなる？
// ※2行目はわざと実行時エラーになる教材です（ArrayIndexOutOfBoundsException）。
class LastElement {
    public static void main(String[] args) {
        int[] nums = {11, 22, 33, 44};
        System.out.println(nums[nums.length - 1]);   // 最後の要素
        System.out.println(nums[nums.length]);       // これは？
    }
}
