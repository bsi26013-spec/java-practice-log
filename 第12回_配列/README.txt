第12回 配列の基本 ― プログラム一覧（すべて完成・実行用）

  ArrayNew.java    1. 宣言と new（→ 0 / 0。new int[5] は全要素0）
  IndexTest.java   2. 添字は0から（→ 80 / 90）
  LengthTest.java  3. 長さは length（→ 5 10 15 / 要素数: 3）
  TwoArrays.java   4. new int[5]/new int[10] の length（→ 5 10）
  OutOfRange.java  5. 範囲外アクセス ※わざと実行時エラーになる教材
                     （ArrayIndexOutOfBoundsException）
  SizeInput.java   例題5：入力サイズで配列を作る（Scanner）
                     実行例： echo 5 | java SizeInput.java（→ 要素数: 5）

実行（JDK 11以降）：  java ファイル名.java
