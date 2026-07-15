import java.util.Scanner;
import java.util.Random;

class JankenGamePrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int playerHand;
        int cpuHand;

        // 勝敗がついたかどうかを管理する変数
        boolean finished = false;

        System.out.println("じゃんけんゲームを開始します");
        System.out.println("難易度を選んでください");
        System.out.println("1:めちゃよわい");
        System.out.println("2:ふつう");
        System.out.println("3めちゃつよい");
        System.out.print("番号を入力:");
        int difficulty = sc.nextInt();

        if (difficulty == 1) {

        

        // 勝敗がつくまでじゃんけんを繰り返す
        while (!finished) {
            cpuHand = rand.nextInt(3);
            if (cpuHand == 0) {
                System.out.println("CPUの手：グー");
            } else if (cpuHand == 1) {
                System.out.println("CPUの手：チョキ");
            } else if (cpuHand == 2) {
                System.out.println("CPUの手：パー");
            } else {
                System.out.println("CPUの手：不明");
            }

            System.out.println();
            System.out.println("じゃんけんの手を選んでください");
            System.out.println("0：グー");
            System.out.println("1：チョキ");
            System.out.println("2：パー");
            System.out.print("番号を入力：");

            // プレイヤーの手を入力する
            playerHand = sc.nextInt();

            // CPUの手を乱数で決める
            // rand.nextInt(3) は 0、1、2 のどれかを作る

            System.out.println();

            // プレイヤーの手を表示する
            if (playerHand == 0) {
                System.out.println("あなたの手：グー");
            } else if (playerHand == 1) {
                System.out.println("あなたの手：チョキ");
            } else if (playerHand == 2) {
                System.out.println("あなたの手：パー");
            } else {
                System.out.println("あなたの手：不明");
            }

            // CPUの手を表示する
            if (cpuHand == 0) {
                System.out.println("CPUの手：グー");
            } else if (cpuHand == 1) {
                System.out.println("CPUの手：チョキ");
            } else if (cpuHand == 2) {
                System.out.println("CPUの手：パー");
            } else {
                System.out.println("CPUの手：不明");
            }

            // 勝敗を判定する
            if (playerHand == cpuHand) {
                System.out.println("あいこです");
                System.out.println("もう一度じゃんけんします");

            } else if (
                (playerHand == 0 && cpuHand == 1) ||
                (playerHand == 1 && cpuHand == 2) ||
                (playerHand == 2 && cpuHand == 0)
            ) {
                System.out.println("あなたの勝ちです");

                // 勝敗がついたので、while文を終了させる
                finished = true;

            } else {
                System.out.println("CPUの勝ちです");

                // 勝敗がついたので、while文を終了させる
                finished = true;
            }
        }

        }else if (difficulty == 2) {

        // 勝敗がつくまでじゃんけんを繰り返す
        while (!finished) {
            cpuHand = rand.nextInt(3);

            System.out.println();
            System.out.println("じゃんけんの手を選んでください");
            System.out.println("0：グー");
            System.out.println("1：チョキ");
            System.out.println("2：パー");
            System.out.print("番号を入力：");

            // プレイヤーの手を入力する
            playerHand = sc.nextInt();

            // CPUの手を乱数で決める
            // rand.nextInt(3) は 0、1、2 のどれかを作る

            System.out.println();

            // プレイヤーの手を表示する
            if (playerHand == 0) {
                System.out.println("あなたの手：グー");
            } else if (playerHand == 1) {
                System.out.println("あなたの手：チョキ");
            } else if (playerHand == 2) {
                System.out.println("あなたの手：パー");
            } else {
                System.out.println("あなたの手：不明");
            }

            // CPUの手を表示する
            if (cpuHand == 0) {
                System.out.println("CPUの手：グー");
            } else if (cpuHand == 1) {
                System.out.println("CPUの手：チョキ");
            } else if (cpuHand == 2) {
                System.out.println("CPUの手：パー");
            } else {
                System.out.println("CPUの手：不明");
            }

            // 勝敗を判定する
            if (playerHand == cpuHand) {
                System.out.println("あいこです");
                System.out.println("もう一度じゃんけんします");

            } else if (
                (playerHand == 0 && cpuHand == 1) ||
                (playerHand == 1 && cpuHand == 2) ||
                (playerHand == 2 && cpuHand == 0)
            ) {
                System.out.println("あなたの勝ちです");

                // 勝敗がついたので、while文を終了させる
                finished = true;

            } else {
                System.out.println("CPUの勝ちです");

                // 勝敗がついたので、while文を終了させる
                finished = true;
            }
        }

        }else if (difficulty == 3) {

        

        // 勝敗がつくまでじゃんけんを繰り返す
        while (!finished) {

            System.out.println();
            System.out.println("じゃんけんの手を選んでください");
            System.out.println("0：グー");
            System.out.println("1：チョキ");
            System.out.println("2：パー");
            System.out.print("番号を入力：");

            // プレイヤーの手を入力する
            playerHand = sc.nextInt();

            // CPUの手を乱数で決める
            // rand.nextInt(3) は 0、1、2 のどれかを作る

            System.out.println();

            // プレイヤーの手を表示する
            if (playerHand == 0) {
                System.out.println("あなたの手：グー");
            } else if (playerHand == 1) {
                System.out.println("あなたの手：チョキ");
            } else if (playerHand == 2) {
                System.out.println("あなたの手：パー");
            } else {
                System.out.println("あなたの手：不明");
            }

            // CPUの手を表示する
            if (playerHand == 0) {
                System.out.println("CPUの手：パー");
            } else if (playerHand == 1) {
                System.out.println("CPUの手：グー");
            } else if (playerHand == 2) {
                System.out.println("CPUの手：チョキ");
            } else {
                System.out.println("CPUの手：不明");
            }

            System.out.println("CPUの勝ちです");

                // 勝敗がついたので、while文を終了させる
            finished = true;
        }

        }

        System.out.println("ゲームを終了します");

        

        sc.close();
    }
}