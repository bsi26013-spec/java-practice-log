import java.util.Scanner;

public class Ens39_challenge1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("☆☆九九シミューレーター☆☆");
		System.out.println("計算したい段の数を入力してください");
		int baseNumber = sc.nextInt();
		System.out.println(baseNumber + "の段を計算します！");
		for (int i = 1; i <= 9; i++) {
			System.out.println(baseNumber + "×" + i + "=" + baseNumber * i);
		}
	}
}
