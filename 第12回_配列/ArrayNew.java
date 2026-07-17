// 第12回 1. 配列とは・宣言と new（おどろき演習）
// 値を入れていない new int[5]。nums[0] や nums[4] は何が出る？
class ArrayNew {
    public static void main(String[] args) {
        int[] nums = new int[5];
        System.out.println(nums[0]);
        System.out.println(nums[4]);
    }
}
