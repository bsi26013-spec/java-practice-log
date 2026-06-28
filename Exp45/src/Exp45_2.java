
public class Exp45_2 {

	public static void main(String[] args) {
		for (int shelf = 1; shelf <= 10; shelf++) {
			System.out.println(shelf + "番の棚を確認します");
			
			int targetShelf = 6; //検索対象(⽬的の棚)を設定 
			
			if (shelf == targetShelf) { 
			    System.out.println("目的の商品が見つかりました"); 
			    System.out.println(shelf + "番棚から商品を取ります"); 
			    break;
			}
			
		}
		
		System.out.println("商品検索を終了します");
	}

}
