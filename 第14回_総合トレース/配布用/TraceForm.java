// 第14回 つかみ：合計の途中経過を毎回出す。どんな数の並びになる？
class TraceForm {
    public static void main(String[] args) {
        int[] nums = {10, 0, 5};
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            System.out.print(sum + " ");
        }
    }
}
