import java.util.Scanner;
public class Ens50_challenge2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] items = {"あんパン", "メロンパン", "カレーパン", "クロワッサン", "食パン"};
		int[] price = {180, 200, 230, 250, 320};
		boolean isFind = false;
		int orderPrice = 0;
		for (int i = 0; i < items.length; i++) {
			System.out.println(items[i] + "：" + price[i] + "円");
		}
		
		System.out.print("商品名を入力してください：");
		String order = sc.next();
		System.out.print("注文数を入力してください：");
		int orderCount = sc.nextInt();
		
		for (int i = 0; i < items.length; i++) {
			if (items[i].equals(order)) {
				isFind = true;
				orderPrice = price[i] * orderCount;
				System.out.println("商品名：" + items[i]);
				System.out.println("単価：" + price[i] + "円");
				System.out.println("注文数" + orderCount + "個");
				System.out.println("合計金額" + orderPrice + "円");
				break;
			}	
		}
		
		
		if (!isFind) {
			System.out.println("その商品は登録されていません");
		}
	}
}
