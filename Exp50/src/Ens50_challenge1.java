
public class Ens50_challenge1 {

	public static void main(String[] args) {
		String[] names = { 
	            "田宮", "郡司", "伊藤", "万波", "水谷", 
	            "北山", "達", "山懸", "清宮", "奈良間" 
	        }; 
	 
	        int[] scores = { 
	            95, 82, 76, 61, 58, 
	            89, 72, 99, 67, 84 
	        }; 

	    System.out.println("--試験評価一覧--");
	    System.out.println();
		for (int i = 0; i < names.length; i++) {
			if (scores[i] >= 90) {
				System.out.println(names[i] + "：S");
			} else if (scores[i] >= 80) {
				System.out.println(names[i] + "：A");
			} else if (scores[i] >= 70) {
				System.out.println(names[i] + "：B");
			} else if (scores[i] >= 60) {
				System.out.println(names[i] + "：C");
			} else {
				System.out.println(names[i] + "：D");
			}
		}
	}

}
