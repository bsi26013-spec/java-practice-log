
public class Ens54_challenge1 {

	public static void main(String[] args) {
		int score[][] = {
				{78, 84, 72},
				{66, 69, 81},
				{92, 88, 90},
				{55, 64, 70},
				{84, 75, 72}
		};
		
		int subject1Sum = 0;
		int subject2Sum = 0;
		int subject3Sum = 0;
		
		for (int i = 0; i < 5; i++) {
			int total = 0;
			System.out.print("学生" + (i + 1) + "：");
			for (int j = 0; j < 3; j++) {
				if (j == 0) {
					subject1Sum += score[i][j];
				}else if (j == 1) {
					subject2Sum += score[i][j];
				} else {
					subject3Sum += score[i][j];
				}		
				total += score[i][j];
				System.out.print("科目" + (j + 1) + " " + score[i][j] + "点" + " ");
			}
			System.out.print("平均" + " " + (double) total / score[i].length + "点");
			System.out.println();
		}
		System.out.println();
		
		
		System.out.println("科目1の平均点：" + (double) subject1Sum / score.length + "点");
		System.out.println("科目2の平均点：" + (double) subject2Sum / score.length + "点");
		System.out.println("科目3の平均点：" + (double) subject3Sum / score.length + "点");
	}

}
