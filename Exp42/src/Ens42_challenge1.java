
public class Ens42_challenge1 {

	public static void main(String[] args) {
		for(int year = 2026; year <= 2035; year++) {
			System.out.println(year + "年");
			for (int month = 1; month <= 12; month++) {
				if (month == 12) {
					System.out.print(month + "月");
				} else {
					System.out.print(month + "月" + " ");	
				}
			}
			System.out.println();
			System.out.println();
		}
	}

}
