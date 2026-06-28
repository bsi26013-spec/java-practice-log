
public class Exp58_3 {

	public static void main(String[] args) {
		String[] pets = {"イヌ", "ネコ", "ハムスター"};
		
		for (int i = 0; i < pets.length; i++) {
			pets[i] = "ペット";
			System.out.println(pets[i]);
		}
		
		
		System.out.println("ーーー配列の中身確認ーーー");
		for (String pet : pets) {
			System.out.println(pet);
		}
		
	}

}
