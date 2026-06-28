
public class Ens52_challenge1 {

	public static void main(String[] args) {
		double[] heights = {170.5, 165.2, 180.1, 155.8, 172.0};
		System.out.println("--ソート前--");
		for (double height : heights){
			System.out.print(height + " ");
		}
		System.out.println();
		
		
		for (int i = 0; i < heights.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < heights.length; j++) {
				if (heights[j] < heights[minIndex]) {
					minIndex = j;
				}
			}
			double temp = heights[i];
			heights[i] = heights[minIndex];
			heights[minIndex] = temp;			
		}
		
		System.out.println("--ソート後(昇順)--");
		for (double height : heights){
			System.out.print(height + " ");
		}
		System.out.println();
		
		/*
		System.out.println("--ソート後(降順)--");
		for (int i = heights.length - 1; i >= 0; i--) {
			System.out.print(heights[i] + " ");
		}
		System.out.println();
		*/
		
		
		for (int i = 0; i < heights.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < heights.length; j++) {
				if (heights[j] > heights[minIndex]) {
					minIndex = j;
				}
			}
			double temp = heights[i];
			heights[i] = heights[minIndex];
			heights[minIndex] = temp;			
		}
		
		System.out.println("--ソート後(降順)--");
		for (double height : heights){
			System.out.print(height + " ");
		}
		
		
		
	}

}
