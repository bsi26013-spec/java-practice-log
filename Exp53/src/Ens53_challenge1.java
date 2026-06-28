import java.util.Random;

public class Ens53_challenge1 {

	public static void main(String[] args) {
		Random rand = new Random();
		String[][] student = {
				{"佐藤", "鈴木", "高橋", "田中"},
				{"伊藤", "山本", "渡辺", "中村"},
				{"小林", "加藤", "吉田", "山田"}
		};
		
		int row = rand.nextInt(3);
		int col = rand.nextInt(4);
		
		System.out.println("じゃあ、この問題の答えはなんですか？");
		System.out.println("前から" + (row + 1) + "番目," +  "左から" + (col + 1) + "番目の" + 
		student[row][col] + "さん、回答してください。");
	}

}
