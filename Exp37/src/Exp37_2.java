
public class Exp37_2 {

	public static void main(String[] args) {
		int countWhile = 3;
		
		while (countWhile < 3) {
			System.out.println("while文：" + countWhile);
			countWhile++;
		}
		
		System.out.println("---区切り---");
		
		int countDoWhile = 3; 
		 
        do { 
        		System.out.println("do〜while 文：" + countDoWhile); 
            countDoWhile++; 
        } while (countDoWhile < 3); 
	}

}
