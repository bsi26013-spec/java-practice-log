
public class Exp56_challenge2 {

	public static void main(String[] args) {
		String name = args[0];
		String[] subjects = {"国語", "数学", "英語", "理科", "社会"};
		int[] score = new int[5];
		for (int i = 1; i <= args.length - 1; i++) {
			score[i - 1] = Integer.parseInt(args[i]);
		}
		
		int threeSum = 0;
		int fiveSum = 0;
		
		for (int i = 0; i < 3; i++) {
			threeSum += score[i];
		}
		
		for (int i = 0; i < 5; i++) {
			fiveSum += score[i];
		}
		
		double threeAverage  = (double) threeSum / 3;
		double fiveAverage = (double) fiveSum / 5;
		
		System.out.println("ーー集計結果ーー");
		System.out.println("名前：" + name);
		System.out.print("成績：");
		
		for (int i = 0; i < 5; i++) {
			System.out.print(subjects[i] + score[i] + "点" + " ");
		}
		
		System.out.println();
		System.out.println("3教科平均：" + threeAverage + "点");
		System.out.println("5教科平均：" + fiveAverage+  "点");
	}

}
