import java.util.Random;

public class Ens35_challenge1 {

	public static void main(String[] args) {
		Random random = new Random();
		
		int people = random.nextInt(30) + 1;
		
		while (people >= 0) {
			int human = random.nextInt(10) + 1;
			System.out.println("現在の待ち人数：" + people);
			System.out.println("お待たせいたしました、" + human + "名様お席にご案内いたします");
			people -= human;
		}
		
		System.out.println("待ち人数は０人です、すぐにご案内できます");
		
		
		
		
	}

}
