class Exp53_1 {
	public static void main(String[] args) {
		int[][] scores = new int[3][2];

		//学⽣ 1 の成績を⼊⼒ 
		scores[0][0] = 80; //国語 
		scores[0][1] = 75; //数学 

		//学⽣ 2 の成績を⼊⼒ 
		scores[1][0] = 70; //国語 
		scores[1][1] = 85; //数学 

		//学⽣ 3 の成績を⼊⼒ 
		scores[2][0] = 90; //国語 
		scores[2][1] = 60; //数学 

		//学⽣ 1 の国語と数学を並べて出⼒ 
		System.out.println(scores[0][0] + " " + scores[0][1]);

		//学⽣ 2 の国語と数学を並べて出⼒ 
		System.out.println(scores[1][0] + " " + scores[1][1]);

		//学⽣ 3 の国語と数学を並べて出⼒ 
		System.out.println(scores[2][0] + " " + scores[2][1]);
	}
}