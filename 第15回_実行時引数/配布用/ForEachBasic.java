// 第15回 本丸2：拡張for。word には何が入る？ 出力は？
class ForEachBasic {
    public static void main(String[] args) {
        String[] words = {"Hello", "World"};
        for (String word : words) {        // words の要素を1つずつ word へ
            System.out.print(word + " ");
        }
        System.out.println();

        int[] nums = {1, 3, 5, 7, 9};

        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        char[] names = {'a', 'b', 'c', 'd', 'e', 'f'};

        for (char c : names) {
            System.out.print(c + " ");
        }
        System.out.println();

        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");
        }
    }
}
