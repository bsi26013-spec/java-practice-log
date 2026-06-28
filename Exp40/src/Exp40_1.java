import java.util.Random;

public class Exp40_1 {

	public static void main(String[] args) {
		Random rand = new Random();

		int totalVisitors = 0;

		for (int day = 1; day <= 5; day++) {
			int visitors = rand.nextInt(21) + 10; 
			totalVisitors += visitors;

			System.out.println(day + "日目の来店人数：" + visitors + "人");
		}

		System.out.println("5 日間の合計来店人数：" + totalVisitors + "人");
	}

}
