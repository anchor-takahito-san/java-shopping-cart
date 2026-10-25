<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>カート選択</title>
</head>
<body>
	<p>${loginUser.user}</p>
	<h2>●スコープドックの選択</h2>
	<form action="CCCart" method="post">
		<input type="radio" name="scope" value="0" disabled>ポリスドッグ「page: 画面更新で即死亡（儚いスコープ）」
		<br>
		<input type="radio" name="scope" value="1" checked>マーシィドッグ 「request: 次の遷移で即死亡（一瞬のスコープ）」
		<br>
		<input type="radio" name="scope" value="2" disabled>レッドショルダー仕様 「session: 本命（普通に買える安全なスコープ）」
		<br>
		<input type="radio" name="scope" value="3" disabled>ターボカスタム（キリコ専用機） 「application: 全ユーザーでカート共有（危険すぎるスコープ）」
		<br>
		<br>
		<h3>◆オプション</h3>
		<input type="checkbox" name="scopeOption" value="0" disabled>こいつの肩は<span style="color: red;">赤く</span>塗らねぇのか？
		<br>
		<input type="checkbox" name="scopeOption" value="1" disabled><span style="color: blue;">キリコが飲むウドのコーヒーは苦い</span>
		<br>
		<br>
		<input type="submit" style="width: 80%; height: 80%; font-size: 100px; padding: 30px;" value="戦場（売り場）へ">
	</form>
</body>
</html>