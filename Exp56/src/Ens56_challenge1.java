import java.util.Random;

public class Ens56_challenge1 {

	public static void main(String[] args) {
		Random rand = new Random();
		int count = Integer.parseInt(args[0]);
		int memberCount = args.length - 1;
		
		System.out.println("ーー ロシアンルーレット ーー");
		System.out.println("・参加者数：" + memberCount + "人");
		System.out.print("・参加者一覧：");
		for (int i = 1; i <= memberCount; i++) {
			System.out.print(" "+ args[i]);
		}
		System.out.println();
		System.out.println();
		for (int i = 1; i <=count; i++) {
			int num = rand.nextInt(memberCount) + 1;
			System.out.println(i + "回目");
			System.out.println("当たり：" + args[num]);
			System.out.println();
		}
	}

}
