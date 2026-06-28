class Exp52_1 {
	public static void main(String[] args) {
		int[] scores = { 40, 70, 30, 60, 20 };

		//最初の配列の並び順の確認 
		System.out.println("--- ソート前 ---");
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + " ");
		}
		System.out.println();

		//昇順のソート処理を実⾏ 
		for (int i = 0; i < scores.length - 1; i++) {
			//配列の最⼩値がどの要素の添字にいるかを記録する 
			int minIndex = i;
			//未確定範囲の要素のなかから最⼩値を検索 
			for (int j = i + 1; j < scores.length; j++) {
				if (scores[j] < scores[minIndex]) {
					minIndex = j;
				}
			}
			//最⼩値が⾒つかったら、未確定の範囲の先頭の要素と交換 
			int temp = scores[i];
			scores[i] = scores[minIndex];
			scores[minIndex] = temp;
		}

		//ソート完了後の配列の並び順の確認 
		System.out.println("--- ソート後（⼩さい順） ---");
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + " ");
		}
		System.out.println();
	}
}