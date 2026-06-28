
class Exp42_4 {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) { //外側のループ(縦に並べる) 
			for (int j = 1; j <= 4; j++) { //内側ループ(横に並べる) 
				System.out.print("*");
			}
			System.out.println(); //外側ループごとに改⾏(縦に並べる) 
		}
	}
}