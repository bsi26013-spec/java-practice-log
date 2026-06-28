import java.util.Random;
import java.util.Scanner;

public class Ens39_challenge2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("---名前を入力してください---");
		String characterName = sc.next();
		int hp = 1;
		int attack =1;
		int defence = 1;
		int coolness = 1;
		System.out.println("キャラクター名：" + characterName);
		System.out.println("初期ステータス");
		System.out.println("HP：" + hp);
		System.out.println("攻撃力：" + attack);
		System.out.println("防御力：" + defence);
		System.out.println("カッコよさ：" + coolness);
		System.out.println();
		System.out.println();
		
		for (int level = 1; level <= 5; level++) {
			
			//それぞれの上昇量
			int hpUp = rand.nextInt(10) + 1;
			int attackUp = rand.nextInt(5) + 1;
			int defenseUp = rand.nextInt(5) + 1;
			int coolnessUp = rand.nextInt(5) + 1;
			
			//対応するステータスの変数に加算
			System.out.println(characterName + "は" + level + "レベルに上がりました！");
			System.out.println("HPが" + hpUp + "上がりました");
			System.out.println("攻撃力が" + attackUp + "上がりました");
			System.out.println("防御力が" + defenseUp + "上がりました");
			System.out.println("カッコよさが" + coolnessUp + "上がりました");	
			hp += hpUp;
			attack += attackUp;
			defence += defenseUp;
			coolness += coolnessUp;
			System.out.println();
			System.out.println();
		}
		
		System.out.println("レベルアップ処理が完了しました");
		System.out.println("レベル５のステータス");
		System.out.println("HP：" + hp);
		System.out.println("攻撃力：" + attack);
		System.out.println("防御力：" + defence);
		System.out.println("カッコよさ：" + coolness);
	}

}
