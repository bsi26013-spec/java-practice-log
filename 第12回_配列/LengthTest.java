// 第12回 3. 長さの取得は length（おどろき演習）
// nums.length はいくつ？ ループは何回まわる？
class LengthTest {
    public static void main(String[] args) {
        int[] nums = {5, 10, 15};
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        System.out.println("要素数: " + nums.length);
    }
}
