class Exp51_1 {
	public static void main(String[] args) {
		int a = 90;
		int b = 40;

		System.out.println("--- 交換前 ---");
		System.out.println("a：" + a);
		System.out.println("b：" + b);

		if (a > b) {
			int temp = a;
			a = b;
			b = temp;
		}

		System.out.println("--- 交換後 ---");
		System.out.println("a：" + a);
		System.out.println("b：" + b);
	}
}
