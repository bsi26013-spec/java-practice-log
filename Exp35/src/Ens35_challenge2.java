import java.util.Scanner;

public class Ens35_challenge2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("現在の貯金額を入力してください");
		int money = sc.nextInt();
		System.out.println("目標金額を入力してください");
		int gole = sc.nextInt();
		System.out.println("毎月の貯金金額を入力してください");
		int monthlySaving = sc.nextInt();
		
		int month = 1;
		
		while (money < gole) {
			money += monthlySaving;
			System.out.println(month + "か月目：貯金額は" + money + "円です");
			month++;
		}
		
		System.out.println("目標金額に達成しました、おめでとう！");
	}

}
