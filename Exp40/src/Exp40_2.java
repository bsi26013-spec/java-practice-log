import java.util.Random;

public class Exp40_2 {

	public static void main(String[] args) {
		Random rand = new Random();

		int totalVisitors = 0;
		int day = 1;
		
		while (day <= 5) {
			int visitors = rand.nextInt(21) + 10; 
			totalVisitors += visitors;

			System.out.println(day + "日目の来店人数：" + visitors + "人");
			day++;
		}
		System.out.println("5 日間の合計来店人数：" + totalVisitors + "人");
	}

}
