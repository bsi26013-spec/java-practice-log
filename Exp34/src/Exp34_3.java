import java.util.Random;
import java.util.Scanner;

class Exp34_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("コマンドを選択してください");
		System.out.println("1: 通常攻撃");
		System.out.println("2: 全⼒攻撃");
		System.out.print("⼊⼒ > ");
		
		int command = scanner.nextInt();
		switch (command) {
		case 1:
			System.out.println("通常攻撃を選択しました！");
			if (random.nextInt(100) < 80) {
				System.out.println("攻撃成功！");
				System.out.println("的に１０ダメージを与えた！");
			} else {
				System.out.println("攻撃失敗！");
				System.out.println("敵にダメージを与えられなかった！");

			}
			break;
			
		case 2:
			System.out.println("全力攻撃を選択しました！");
			if (random.nextInt(100) < 50) {
				System.out.println("攻撃成功！");
				System.out.println("的に２５ダメージを与えた！");
			} else {
				System.out.println("攻撃失敗！");
				System.out.println("全力攻撃は外れてしまった！");
			}
			break;
			
		default:
			System.out.println("正しいコマンドを入力してください。");
			break;
		}
		scanner.close();
	}
}
