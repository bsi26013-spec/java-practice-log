import java.util.Random;
import java.util.Scanner;

public class Ens37_challenge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		boolean judge = false;
		int score = 0;
		
		while (!judge) {
		int treasureCode = rand.nextInt(5) + 1;
		int choice;
		int tryCount = 0;
		boolean isHit = false;
			do {
				System.out.println("残り回数：" + (3 - tryCount));
				System.out.print("宝箱を選んでください（1～5）：");
				choice = sc.nextInt();
				tryCount++;
				if (choice == treasureCode) {
					System.out.println("当たりです！");
					isHit = true;
				} else {
					System.out.println("はずれです");
				}
				System.out.println();
			} while (!isHit && tryCount < 3 );
			
			if (isHit == true) {
				score++;
				System.out.println("クリア！");
				System.out.println("現在の連続成功回数：" + score);
				System.out.println();
				System.out.println("新しい宝箱探しを開始します");
			} else {
				System.out.println("ゲームオーバー...");
				System.out.println("当たりの宝箱は" + treasureCode +  "でした");
				System.out.println("連続成功回数：" + score);
				judge = true;
			}
			
		}
		sc.close();
	}

}
