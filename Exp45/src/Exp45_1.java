
public class Exp45_1 {

	public static void main(String[] args) {
		for (int count = 1; count <= 5; count++) {
			System.out.println(count + "回目の処理です");
			
			if (count == 3) {
				System.out.println("ここでbreak文を実行します");
				break;
			}
			
			System.out.println(count + "回目の処理を続けます");
		}
		System.out.println("ループの外に出ました");
	}

}
