
public class Exp58_4 {

	public static void main(String[] args) {
		String[][] petKinds = {
				{ "柴犬", "トイプードル", "チワワ" },
				{ "三毛猫", "ロシアンブルー", "スコティッシュフォールド" },
				{ "セキセイインコ", "文鳥", "オカメインコ" }
		};
		
		for (String[] kindGrop : petKinds) {
			for (String kindName : kindGrop) {
				System.out.print(kindName + " ");
			}
			System.out.println();
		}
	}

}
