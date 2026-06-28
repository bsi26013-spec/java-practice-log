import java.util.Random;

public class Exp46_2 {

	public static void main(String[] args) {
		Random rand = new Random();
		int guideCount = 0;
		
		for (int number = 1; number <= 6; number++) {
			boolean hasIdCard = rand.nextBoolean();
			
			System.out.println(number + "番の方を確認します");
			
			if (!hasIdCard) {
				System.out.println("本人確認書類がないため受付できません");
				System.out.println();
				continue;
			}
			
			System.out.println("本人確認を行います");
			System.out.println("入場チケットを発行します");
			guideCount++;
			System.out.println();
		}
		
		System.out.println("通常受付を行った人数：" + guideCount + "人");
	}

}
