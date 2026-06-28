import java.util.Random;

public class Ens40_challenge1 {

	public static void main(String[] args) {
		Random rand = new Random();
		int totalSales = 0;
		System.out.println("お店の一週間の売上を集計します");
		for (int day = 1; day <= 7; day++) {
			int visitors = rand.nextInt(21) + 10;
			int dailySales = visitors * 500;
			totalSales += dailySales;
			System.out.println(day + "日目：" + "来店人数" + visitors + "、" + "売上" + dailySales + "円");
		}
		System.out.println("7日間の合計売上：" + totalSales + "円");
	}

}
