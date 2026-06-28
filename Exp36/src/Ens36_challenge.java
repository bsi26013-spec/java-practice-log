import java.util.Random;
import java.util.Scanner;

class Ens36_challenge {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random rand = new Random();

		while (true) {
			
			System.out.println("あなたの手を入力してください");
			System.out.println("0：グー、1：チョキ、2：パー");

			int playerHand = scanner.nextInt();
			int cpuHand = rand.nextInt(3);

			System.out.println("じゃーんけーんポン！！");
			
			
			//switch文でplayerHandによる手の種類を表示　不整合ならcontinueでwhileをやり直す
			switch (playerHand) {
			case 0 -> System.out.println("あなたの手：グー");
			case 1 -> System.out.println("あなたの手：チョキ");
			case 2 -> System.out.println("あなたの手：パー");
			 default -> {
		            System.out.println("1〜3を入力してください。もう一度入力してください。");
		            continue;
		        }
			}
			
			//switch文のcpuHandバージョン
			switch (cpuHand) {
			case 0 -> System.out.println("コンピュータの手：グー");
			case 1 -> System.out.println("コンピュータの手：チョキ");
			case 2 -> System.out.println("コンピュータの手：パー");
			 default -> {
		            System.out.println("1〜3を入力してください。もう一度入力してください。");
		            continue;
		        }
			}
			
			
			if (cpuHand == 0) {
				System.out.println("コンピュータの手：グー");
			} else if (cpuHand == 1) {
				System.out.println("コンピュータの手：チョキ");
			} else {
				System.out.println("コンピュータの手：パー");
			}

			if (playerHand == 0) {
				if (cpuHand == 0) {
					System.out.println("結果：あいこです");
					System.out.println("もう一度じゃんけんします");
				} else if (cpuHand == 1) {
					System.out.println("結果：あなたの勝ちです");
					break;
				} else {
					System.out.println("結果：あなたの負けです");
					break;
				}
			} else if (playerHand == 1) {
				if (cpuHand == 0) {
					System.out.println("結果：あなたの負けです");
					break;
				} else if (cpuHand == 1) {
					System.out.println("結果：あいこです");
					System.out.println("もう一度じゃんけんします");
				} else {
					System.out.println("結果：あなたの勝ちです");
					break;
				}
			} else {
				if (cpuHand == 0) {
					System.out.println("結果：あなたの勝ちです");
					break;
				} else if (cpuHand == 1) {
					System.out.println("結果：あなたの負けです");
					break;
				} else {
					System.out.println("結果：あいこです");
					System.out.println("もう一度じゃんけんします");
				}
			}
		}
		System.out.println("じゃんけんを終了します");

	}
}