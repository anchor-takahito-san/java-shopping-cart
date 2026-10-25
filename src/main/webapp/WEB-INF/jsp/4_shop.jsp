<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>買い物画面</title>
</head>
<body>
	<h1>買え！この世の全てはここに置いてある！</h1>
	<form action="DCShop" method="post">
		<table border="1" style="width:1400px">
	 		<tr bgcolor="yellow">
	 			<th>No.</th><th>イメージ</th><th>名称</th><th>値段(円)</th><th>個数</th><th>購入</th>
	 		</tr>
	 		<tr><td>1</td><td>Now printing</td><td>ベッカムの剃刀</td><td>1,000,000,000</td><td>1</td><td><input type="checkbox" name="cartNo" value="0"></td></tr>
	 		<tr><td>2</td><td>Now printing</td><td>オッカムの剃刀</td><td>1</td><td>1</td><td><input type="checkbox" name="cartNo" value="1"></td></tr>
 			<tr><td>3</td><td>Now printing</td><td>クセノフォンのストーク日記</td><td>グラハム数</td><td>売切れ</td><td><input type="checkbox" name="cartNo" value="2" disabled></td></tr>
 			<tr><td>4</td><td>Now printing</td><td>ソクラテス直筆の自著（偽物）</td><td>TREE(3)</td><td>売切れ</td><td><input type="checkbox" name="cartNo" value="3" disabled></td></tr>
	 		<tr><td>5</td><td>Now printing</td><td>ユニクロのワンピース</td><td>1,800</td><td>100</td><td><input type="checkbox" name="cartNo" value="4"></td></tr>
	 		<tr><td>6</td><td>Now printing</td><td>ONE PIECE（本物）</td><td>時価</td><td>在庫あり</td><td><input type="checkbox" name="cartNo" value="5"></td></tr>
	 		<tr><td>7</td><td>Now printing</td><td>ダミー７</td><td>1,000</td><td>在庫あり</td><td><input type="checkbox" name="cartNo" value="6"></td></tr>
	 		<tr><td>8</td><td>Now printing</td><td>ダミー８</td><td>3,000</td><td>在庫あり</td><td><input type="checkbox" name="cartNo" value="7"></td></tr>
	 		<tr><td>9</td><td>Now printing</td><td>ダミー９</td><td>4,500</td><td>在庫あり</td><td><input type="checkbox" name="cartNo" value="8"></td></tr>
	 		<tr><td></td><td></td><td></td><td></td><td></td><td><input type="checkbox" name="cartNo" value="10" disabled></td></tr>
	 	</table>
	 	<br>
		<input type="submit" style="width: 70%; height: 70%; font-size: 90px; padding: 30px;" value="人の夢は!!! 終わらねェ!!!!">
	</form>
</body>
</html>