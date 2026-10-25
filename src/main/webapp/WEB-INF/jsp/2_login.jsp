<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ログイン認証</title>
</head>
<body>
	<h1>ユーザIDとパスワードを入力してください</h1>
	<form action="BCLogin" method="post">
		ユーザID：<input type="text" name="id">
		<br>
		パスワード：<input type="text" name="pw">
		<br>
		<br>
		<input type="submit" style="width: 90%; height: 90%; font-size: 200px; padding: 30px;" value="発動承認">
	</form>
	<br>
	<h6>ヒント：エラーハンドリング面倒なので、未入力でもログインできます(怠惰)</h6>

</body>
</html>