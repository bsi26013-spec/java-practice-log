第8回 while文・do while文（復習）ソースコード

【配布用】…学生に配るファイル（そのまま実行 or 空欄を埋める）
  WhileBasic.java    つかみ：そのまま実行（→ 0 1 2）
  UpdateForget.java  サイクル1：更新式なし＝無限ループ（止めるのは Ctrl+C）。空欄①に更新式
  FlagTest.java      本丸：そのまま実行（→ 見つかった）
  DoWhileTest.java   do while：そのまま実行（→ 1回は実行される: 10）
  MenuWhile.java     使い分け比較【while版】
  MenuDoWhile.java   使い分け比較【do while版】※MenuWhileと同じ動作
  Unreachable.java   回収：実行するとコンパイルエラー（到達不能コード）※教材
  LoopCount.java     チャレンジ：何回繰り返す？の土台（①は完成、②③④を追記）

【解答】…教員用（同名ファイル・完成版）
  UpdateForget.java（→ 1 3） / LoopCount.java（→ ①10000 ②10001 ③9998 ④9999）

実行方法（JDK 11以降）：  java ファイル名.java
  Menu系は入力が必要（例：printf "2\n3\n0\n" | java MenuDoWhile.java）
