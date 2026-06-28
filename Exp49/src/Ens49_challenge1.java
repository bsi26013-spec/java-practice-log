import java.util.Random;

public class Ens49_challenge1 {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] redList = new int[rand.nextInt(100) + 1];
		int[] blueList = new int[rand.nextInt(100) + 1];
		int[] greenList = new int[rand.nextInt(100) + 1];
		
		
		System.out.println("red配列の要素数：" + redList.length);
		System.out.println("blue配列の要素数：" + blueList.length);
		System.out.println("green配列の要素数：" + greenList.length);
		
		int topLength = redList.length;
		String topName = "red";
		
		if (topLength < blueList.length) {
			topLength = blueList.length;
			topName = "blue";
		}
		
		if (topLength < greenList.length) {
			topLength = greenList.length;
			topName = "green";
		}
		
		System.out.println("今回の1位：" + topName + "配列" + "（要素数" + topLength + "）");
		
	}

}
