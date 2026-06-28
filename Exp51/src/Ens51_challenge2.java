
public class Ens51_challenge2 {

	public static void main(String[] args) {
		int[] scores = {50, 40, 30, 20, 10}; 
		
		System.out.println("--処理前--");
		for (int score : scores) {
			System.out.print(score + " ");
		}
		System.out.println();
		System.out.println();
		
		
		for (int i = 0; i < scores.length - 1; i++) {
			for (int j = scores.length - 1; j > i; j--) {
				if (scores[j - 1] > scores[j]) {
					int b = scores[j - 1];
					scores[j - 1] = scores[j];
					scores[j] = b;
				}
			}
			System.out.print("パス" + (i + 1) + "回目終了時；" + " ");
			for (int score : scores) {
				System.out.print(score + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("--ソート完了後--");
		for (int score : scores) {
			System.out.print(score + " ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores.length - i - 1; j++) {
				if (scores[j] > scores[j + 1]) {
					int b = scores[j];
					scores[j] = scores[j + 1];
					scores[j + 1] = b;
				}
			}
			for (int score : scores) {
				System.out.print(score + " ");
			}
			System.out.println();
		}
		*/
	}
}
