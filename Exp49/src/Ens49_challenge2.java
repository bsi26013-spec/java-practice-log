import java.util.Scanner;
public class Ens49_challenge2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] skillName = {"やどりぎのタネ", "みがわり", "アンコール", "ムーンフォース"};
		String newSkill = "まもる";
		
		System.out.println("エルフーンはあたらしい「まもる」を覚えたい...");
		System.out.println("しかしわざを4つおぼえるのでせいいっぱいだ！");
		System.out.println();
		
		System.out.println("--おぼえているわざリスト--");
		int i = 1;
		for (String skill : skillName) {
			System.out.println(i + "：" + skill);
			i++;
		}
		
		System.out.println();
		System.out.print("何番目のわざを忘れますか：");
		int forgetNo = sc.nextInt();
		skillName[forgetNo] = "まもる";
		
		System.out.println("1、2の...ポカン！");
		System.out.println("エルフーンはあたらしく「まもる」をおぼえた！");
		System.out.println();

		System.out.println("--おぼえているわざリスト--");
		i = 1;
		for (String skill : skillName) {
			System.out.println(i + "：" + skill);
			i++;
		}
		
	}

}
