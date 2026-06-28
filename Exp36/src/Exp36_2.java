
public class Exp36_2 {

	public static void main(String[] args) {
		int count = 1;
		
		
		while (true) {
			System.out.println("処理を実行します");
			System.out.println(count + "回目の処理です");
			
			if (count == 3) {
				break;
			}
			
			count += 1;
		}
		
		System.out.println("while文を抜けました");
	}

}
