import java.util.Scanner;

public class Ens38_challenge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ーーログイン画面ーー");
		int correctPin = 1234;
		int inputPin;
		int attempts = 0;
		String userName = "user";
		String inputName;
		
		do {
			System.out.print("アカウント名を入力してください：");
			inputName = sc.next();
			System.out.print("暗証番号を入力してください：");
			inputPin = sc.nextInt();
			attempts++;
			
			if (inputPin == correctPin && inputName.equals(userName)) {
				System.out.println("ログインしました");
			} else if (inputPin != correctPin && !inputName.equals(userName)) {
				System.out.println("アカウント名が違います");
				System.out.println("暗証番号が違います");
			} else if (!inputName.equals(userName)) {
				System.out.println("アカウント名が違います");
			}  else if (inputPin != correctPin) {
				System.out.println("暗証番号が違います");
			}
			
		} while ((inputPin != correctPin || !inputName.equals(userName)) && attempts < 3);
		
		if (attempts >= 3 && (inputPin != correctPin || !inputName.equals(userName))) {
		    System.out.println("ロックされました");
		}
		
		sc.close();
	}

}
