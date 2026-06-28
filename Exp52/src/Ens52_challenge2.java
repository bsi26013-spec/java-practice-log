public class Ens52_challenge2 {

	public static void main(String[] args) {
		String[] names = { "井上", "加藤", "佐々木", "高橋", "田中",
		"前田", "山田", "吉田" };
		int[] examScores = { 90, 75, 85, 90, 75, 60, 75, 50 };
		int[] interviewScores = { 8, 7, 6, 9, 5, 4, 8, 7 };
		
		System.out.println("---ソート前---");
		for (int i = 0; i < names.length; i++) {
			System.out.println(
			names[i]	 + " " +
			examScores[i] + " " +
			interviewScores[i]
			);
		}
		
		for (int i = 0; i < examScores.length - 1; i++) {
			int maxIndex = i;
			for (int j = i + 1; j < examScores.length; j++) {
				if (examScores[j] > examScores[maxIndex]) {
					maxIndex = j;
				} else if (examScores[j] == examScores[maxIndex] && 
						interviewScores[j] > interviewScores[maxIndex]) {
					maxIndex = j;
				}
			}
			int temp = examScores[i];
			examScores[i] = examScores[maxIndex];
			examScores[maxIndex] = temp;
			
			String name = names[i];
			names[i] = names[maxIndex];
			names[maxIndex] = name;
			
			int interview = interviewScores[i];
			interviewScores[i] = interviewScores[maxIndex];
			interviewScores[maxIndex] = interview; 
		}
		
		System.out.println();
		System.out.println("---ソート後---");
		for (int i = 0; i < names.length; i++) {
			System.out.println(
			names[i]	 + " " +
			examScores[i] + " " +
			interviewScores[i]
			);
		}
		
		
		/*
		System.out.println();
		for (String name : names) {
			System.out.print(name + " ");
		}
		System.out.println();
		for (int name : interviewScores) {
			System.out.print(name + " ");
		}		
		System.out.println();
		for (int sum : examScores) {
			System.out.print(sum + " ");
		}
		*/
	}

}
