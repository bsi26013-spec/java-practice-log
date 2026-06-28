import java.util.Random;
import java.util.Scanner;

class Ens34_challenge {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int enemyHp = random.nextInt(21) + 5;
		int playerMp = random.nextInt(10);
		int damage = 0;
		
		
		System.out.println("敵が現れた！");
		System.out.println("敵のHP:" + enemyHp);
		System.out.println("自分のMP:" + playerMp);
		System.out.println("コマンドを選択してください");
		System.out.println("1: 通常攻撃");
		System.out.println("2: 全力攻撃");
		System.out.println("3: 魔法攻撃（MP を 7 消費）");
		System.out.print("入力 > ");
		
		int command = scanner.nextInt();
		switch (command) {
		case 1:
			System.out.println("通常攻撃を選択しました！");
			if (random.nextInt(100) < 80) {
				damage += 10;
			} else {
				damage += 0;
				System.out.println("敵にダメージを与えられなかった！");

			}
			break;
			
		case 2:
			System.out.println("全力攻撃を選択しました！");
			if (random.nextInt(100) < 50) {
				damage += 25;
			} else {
				damage += 0;
				System.out.println("全力攻撃は外れてしまった！");
			}
			break;
			
		default:
			System.out.println("正しいコマンドを入力してください。");
			damage += 0;
			break;
			
		case 3:
			System.out.println("魔法攻撃を選択しました！");
			if (playerMp >= 7) {
				playerMp -= 7;
				damage += 200;
				
			} else {
				System.out.println("MPが足りません！");
				damage += 0;
			}
		}
		
		enemyHp -= damage;
		System.out.println("敵に" + damage + "ダメージ与えた！");
		System.out.println("敵の残りHP:" + enemyHp);
		System.out.println("自分の残りMP:" + playerMp);
		if (enemyHp <= 0) {
			System.out.println("ゲームクリア！");
			
		} else {
			System.out.println("ゲームオーバー！");
		}
		scanner.close();
	}
}
