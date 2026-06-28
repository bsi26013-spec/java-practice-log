
public class Ens42_challenge2 {

	public static void main(String[] args) {
		for (int row = 1; row <= 5; row++) {
			for (char column = 'A'; column <= 'E'; column++) {
				if (column == 'E') {
					System.out.print(column + "" + row);
				} else {
					System.out.print(column + "" + row + " ");		
				}
			}
			System.out.println();
		}
	}

}
