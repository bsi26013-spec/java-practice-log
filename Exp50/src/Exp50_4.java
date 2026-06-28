class Exp50_4 {
	public static void main(String[] args) {
		String[] fruits = { "Mikan", "Banana", "Orange", "Apple", "Grape" };
		boolean isFind = false;

		for (int i = 0; i < fruits.length; i++) {
			if (fruits[i].equals("Apple")) {
				isFind = true;
			}
		}

		if (isFind) {
			System.out.println("Apple が見つかりました");
		} else {
			System.out.println("Apple は見つかりませんでした");
		}
	}
}
