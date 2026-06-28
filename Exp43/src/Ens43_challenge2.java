
public class Ens43_challenge2 {

	public static void main(String[] args) {
		System.out.println("座席予約状況");
		for (char row = 'A'; row <= 'D'; row++) {
			for (int number = 1; number <= 6; number++) {
				if (row == 'B' && number ==3 || row == 'C' && number == 5) {
					System.out.print(row + "" + number + "☓" + " ");
				} else if (number == 6) {
					System.out.print(row + "" + number + "◯");
				} else {
					System.out.print(row + "" + number + "◯" + " ");
				}
			}
			System.out.println();
		}
	}

}
