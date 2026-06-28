class Exp50_3 {
	public static void main(String[] args) {
		int[] scores = { 80, 65, 90, 70, 85 };
		int count = 0; //カウンター変数を準備 

		for (int i = 0; i < scores.length; i++) {
			if (scores[i] >= 80) {
				//System.out.println(scores[i]); //さっきの消しとく 
				count++; //カウンター変数を増やす処理を追加 
			}
		}

		System.out.println("80 点以上の人数：" + count + "人");
	}
}
