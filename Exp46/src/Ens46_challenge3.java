import java.util.Random;

public class Ens46_challenge3 {

	public static void main(String[] args) {
		Random rand = new Random();
		int investigationCount = 0;
		for (int i = 1; i <= 5; i++) {
			boolean hasAlibi = rand.nextBoolean();
			if (hasAlibi) {
				System.out.println(i + "番の容疑者はアリバイが確認できました");
				System.out.println();
				continue;
			}
			
			System.out.println(i + "番の容疑者を署へ連行します");
			System.out.println("取り調べを開始します");
			investigationCount++;
			boolean isCriminal = rand.nextBoolean();
			if (isCriminal) {
				System.out.println(i +"番の容疑者は犯人でした");
				System.out.println("捜査を終了します");
				break;
			} else {
				System.out.println(i + "番の容疑者は無実でした");
				System.out.println();
			}
			
			
		}
		
		System.out.println("取り調べ人数：" + investigationCount + "人");
	}

}
