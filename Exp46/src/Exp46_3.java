class Exp46_3 {
	public static void main(String[] args) {

		loopCheck:
		for (int outer = 1; outer <= 3; outer++) {
			System.out.println("外側のループ：" + outer + "回目");

			for (int inner = 1; inner <= 3; inner++) {

				if (outer == 2 && inner == 2) {
					System.out.println(" continue 文を実行します");
					continue loopCheck;
				}

				System.out.println("  内側のループ：" + inner + "回目");
			}

			System.out.println("外側のループ" + outer + "回目が終了しました");
		}

		System.out.println("すべてのループが終了しました");
	}
}