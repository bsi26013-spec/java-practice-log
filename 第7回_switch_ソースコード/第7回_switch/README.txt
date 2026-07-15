第7回 switch文（復習）ソースコード

【配布用】…学生に配るファイル（そのまま実行 or 空欄を埋める）
  SwitchBasic.java     つかみ：そのまま実行（→ 入力されたのは4月です春です）
  FallThrough.java     サイクル1：まず実行（→ お茶ジュース）。その後 case2 に break を追加
  SwitchType.java      本丸：実行するとコンパイルエラー（switch に boolean は不可）※教材
  Kenbaiki.java        演習：空欄①を埋める（case 2 に「うどん 480円」+break）
  KenbaikiChange.java  チャレンジ：おつり計算の動く土台

【解答】…教員用（同名ファイル・完成版）
  FallThrough.java / Kenbaiki.java / KenbaikiChange.java

実行方法（JDK 11以降）：  java ファイル名.java
  Scanner を使う Kenbaiki 系は番号入力が必要（例：echo 2 | java Kenbaiki.java）
