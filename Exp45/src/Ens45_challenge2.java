import java.util.Random;

public class Ens45_challenge2 {

	public static void main(String[] args) {
		Random rand = new Random();
		int mineRow = rand.nextInt(5) + 1;
		int mineCol = rand.nextInt(5) + 1;
		
		System.out.println("マップを表示します");
		System.out.println(" A  B  C  D  E");
		for (int row = 1; row <= 5; row++) {
			System.out.print(row);
			for (int col = 1; col <= 5; col++) {
				System.out.print("□ ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println("地雷を探します");
		
		mineSearch:
		for (int row = 1; row <= 5; row++) {
			for (int col = 1; col <= 5; col++) {
				String colName = "";
				switch (col) {
				case 1: {
					colName = "A";
					break;
					}
				case 2: {
					colName = "B";
					break;
					}
				case 3: {
					colName = "C";
					break;
					}
				case 4: {
					colName = "D";
					break;
					}
				case 5: {
					colName = "E";
					break;
					}
				}
				System.out.println(row + "行" + colName + "列" + "確認します");
				if (row == mineRow && col == mineCol) {
					System.out.println("地雷を発見しました");
					break mineSearch;
				}
				
			}
			
		}
		
		System.out.println();
		System.out.println("地雷の位置を表示します");
		System.out.println(" A  B  C  D  E");
		for (int row = 1; row <= 5; row++) {
			System.out.print(row);
			for (int col = 1; col <= 5; col++) {
				if (row == mineRow && col == mineCol) {
					System.out.print("☓ ");
				} else {
					System.out.print("□ ");					
				}
			}
			System.out.println();
		}
		System.out.println("探索を終了します");
	
	}
}
