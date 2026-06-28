class Exp37_3 { 
    public static void main(String[] args) { 
        int treasureCode = 3;  //正解の宝箱の番号 
        int boxNumber = 1;  //⾃分が探し始める宝箱の番号 
 boolean isHit = false; //while 終了スイッチ 
 
        do { 
            System.out.println(boxNumber + "番の宝箱を開けます"); 
 
            if (boxNumber == treasureCode) { 
                System.out.println("当たりです"); 
 isHit = true; //while 終了スイッチをオンに！ 
            } else { 
                System.out.println("はずれです"); 
                boxNumber++; 
            } 
 } while (!isHit); //while 終了スイッチが変わるまで続ける 
 
        System.out.println("宝箱探しを終了します"); 
    } 
} 
