// 第16回 回収：フラグは「途中で起きた出来事」を覚えている。found は最後にどうなる？
class FlagSearch {
    public static void main(String[] args) {
        int[] data = {10, 20, 30};
        boolean found = false;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == 20) {
                found = true;
            }
        }
        System.out.println(found);
    }
}
