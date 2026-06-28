
public class Ens51_challenge1 {

	public static void main(String[] args) {
		char[] letters = {
				'm', 'K', 'y', 'D', 'a', 'X', 'j', 'R', 'b', 'P',
				's', 'C', 'v', 'L', 'e', 'W', 'h', 'N', 'z', 'I',
				'u', 'F', 'q', 'O', 't', 'B', 'k', 'Y', 'c', 'S',
				'g', 'H', 'w', 'A', 'p', 'V', 'n', 'E', 'r', 'M',
				'x', 'J', 'd', 'U', 'i', 'T', 'f', 'Z', 'l', 'G',
				'o', 'Q'
		};
		
		System.out.println("--処理前--");
		for (char c : letters) {
			System.out.print(c + " ");
		}
		
		for (int i = 0; i < letters.length; i++) {
			for (int j = 0; j < letters.length - 1 - i; j++) {
				if (letters[j] > letters[j + 1]) {
					char b = letters[j];
					letters[j] = letters[j + 1];
					letters[j + 1] = b;
				}
			}
		}
		
		System.out.println();
		System.out.println("--ソート完了後--");
		for (char a : letters) {
			System.out.print(a + " ");	
		}	

	}
}
