import java.util.Random;

class Exp45_3 {
	public static void main(String[] args) {
		Random rand = new Random();

		for (int hour = 1; hour <= 6; hour++) {
			System.out.println(hour + "時間目のテスト運転を実行します");

			int stability = rand.nextInt(100) + 1;
			System.out.println("システム安定度：" + stability);

			if (stability <= 80) {
				System.out.println("エラーを検出しました");
				System.out.println("テスト運転を中止します");
				break;
			}

			System.out.println("テスト運転は正常です");
		}

		System.out.println("テスト運転の処理を終了します");
	}
}