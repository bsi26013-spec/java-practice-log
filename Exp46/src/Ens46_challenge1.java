
public class Ens46_challenge1 {

	public static void main(String[] args) {
		int checkCount = 0;
		for (int i = 1; i <= 15; i++) {
			if (i % 5 == 0) {
				System.out.println(i + "番の設備は整備中のためスキップします");
				System.out.println();
				continue;
			}
			System.out.println(i + "番の設備を点検します");
			System.out.println("動作確認を行います");
			System.out.println("点検記録を保存します");
			System.out.println();
			checkCount++;
		}
		System.out.println("完了台数：" + checkCount + "台");
	}

}
