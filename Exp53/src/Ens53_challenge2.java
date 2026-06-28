import java.util.Scanner;

public class Ens53_challenge2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		
		String[][] board= {
				{"・", "・", "・"},
				{"・", "・", "・"},
				{"・", "・", "・"}
		};
		System.out.println("現在のマス");
		for  (String[] i : board) {
			for (String j : i) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		for (int i = 1; i <= 9; i++) {
			String mark;
			if (i % 2 != 0) {
				System.out.println("プレイヤー1の入力です" );
				mark = "○";
			} else {
				System.out.println("プレイヤー2の入力です");
				mark = "×";
			}
			
			System.out.print("行番号を入力してください");
			int row = sc.nextInt();
			System.out.print("列番号を入力してください");
			int col = sc.nextInt();
			
			if (!board[row - 1][col - 1].equals("・")) {
				System.out.println();
				System.out.println("そのマスはすでに選ばれています");
				i--;
				continue;
			}else {
				board[row - 1][col - 1] = mark;
			}
			
			if(
				    (board[0][0].equals(mark) && board[0][1].equals(mark) && board[0][2].equals(mark)) ||
				    (board[1][0].equals(mark) && board[1][1].equals(mark) && board[1][2].equals(mark)) ||
				    (board[2][0].equals(mark) && board[2][1].equals(mark) && board[2][2].equals(mark)) ||

				    (board[0][0].equals(mark) && board[1][0].equals(mark) && board[2][0].equals(mark)) ||
				    (board[0][1].equals(mark) && board[1][1].equals(mark) && board[2][1].equals(mark)) ||
				    (board[0][2].equals(mark) && board[1][2].equals(mark) && board[2][2].equals(mark)) ||

				    (board[0][0].equals(mark) && board[1][1].equals(mark) && board[2][2].equals(mark)) ||
				    (board[0][2].equals(mark) && board[1][1].equals(mark) && board[2][0].equals(mark))
					) {
				
				if (mark.equals("○")) {
					System.out.println("プレイヤー1の勝利");
				} else {
					System.out.println("プレイやー2の勝利");
				}
				break;
			}
			
			System.out.println();
			for  (String[] m : board) {
				for (String j : m) {
					System.out.print(j);
				}
				System.out.println();
			}
		}
		
		System.out.println("===最終盤面===");
			System.out.println();
			for  (String[] m : board) {
				for (String j : m) {
					System.out.print(j);
				}
				System.out.println();
			}
	}

}
