class Exp53_2 {
	public static void main(String[] args) {
		int[][] scores = {
				{ 80, 75 }, //1 ⾏⽬の要素 
				{ 70, 85 }, //2 ⾏⽬の要素 
				{ 90, 60 } //3 ⾏⽬の要素 
		};

		//学⽣ 1 の国語と数学を並べて出⼒ 
		System.out.println(scores[0][0] + " " + scores[0][1]);

		//学⽣ 2 の国語と数学を並べて出⼒ 
		System.out.println(scores[1][0] + " " + scores[1][1]);

		//学⽣ 3 の国語と数学を並べて出⼒ 
		System.out.println(scores[2][0] + " " + scores[2][1]);
	}
}
