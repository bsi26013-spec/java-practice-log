// 第9回 4. for と while の使い分け（おどろき演習）
// 同じ「0 1 2」を for と while の両方で書いた。出力は同じ？
class ForWhile {
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {		
			System.out.print(i + " ");
		}
		System.out.println();
		
		int j = 0;
		while (j < 3) {
			System.out.print(j + " ");
			j++;
		}
	}
}
