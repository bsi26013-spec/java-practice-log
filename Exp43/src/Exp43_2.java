
public class Exp43_2 {

	public static void main(String[] args) {
		int stock = 12;
		
		for (int sale = 1; sale <= 12; sale++) {
			stock--;
			System.out.println(sale + "個目を販売しました");
			System.out.println("残りの在庫；" + stock + "個");
			
			if (stock == 0) {
				System.out.println("在庫がなくなりました");
			} else if (stock <= 5) {
				System.out.println("在庫を補充してください");
			} else {
				System.out.println("在庫に余裕があります");
			}
			
			
			System.out.println();
		}
		
		
	}

}
