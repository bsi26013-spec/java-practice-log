第15回 実行時引数と拡張for ― プログラム一覧

【配布用】※実行時引数は「java ファイル名.java 値1 値2 …」で渡す
  Show.java               つかみ：java Show.java 10 20 30（→ 10 / 3）
  AverageCalculator.java  サイクル1：java AverageCalculator.java 10 20 30（→ Average: 20.0）
  Program.java            本丸1：java Program.java abc ※わざと NumberFormatException
                                java Program.java 5 → 15
  ForEachBasic.java       本丸2：拡張for（→ Hello World）
  ForEachFill.java        穴埋め：コロンの右を埋める（コメントを外して完成させる）
  ForEachUse.java         回収：拡張forの使い分け（→ Dog Cat Fish）
  SumArgs.java            チャレンジ土台：可変個の合計（TODO入り・そのまま実行可）
【解答】
  ForEachFill.java        穴埋め解答（➀＝words → Hello World）
  SumArgs.java            チャレンジ解答例（java SumArgs.java 10 20 30 40 → 100）

実行（JDK 11以降）：  java ファイル名.java [引数…]
