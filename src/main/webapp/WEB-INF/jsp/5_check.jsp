<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>合計金額</title>
</head>
<body>
	<h1>カート合計</h1>
		<br>
		${cart.items[0].item}：${cart.items[0].price}円 が${cart.items[0].cnt}個 → ${cart.items[0].yen}円<br>
		${cart.items[1].item}：${cart.items[1].price}円 が${cart.items[1].cnt}個 → ${cart.items[1].yen}円<br>
		${cart.items[2].item}：${cart.items[2].price}円 が${cart.items[2].cnt}個 → ${cart.items[2].yen}円<br>
		${cart.items[3].item}：${cart.items[3].price}円 が${cart.items[3].cnt}個 → ${cart.items[3].yen}円<br>
		${cart.items[4].item}：${cart.items[4].price}円 が${cart.items[4].cnt}個 → ${cart.items[4].yen}円<br>
		${cart.items[5].item}：${cart.items[5].price}円 が${cart.items[5].cnt}個 → ${cart.items[5].yen}円<br>
		${cart.items[6].item}：${cart.items[6].price}円 が${cart.items[6].cnt}個 → ${cart.items[6].yen}円<br>
		${cart.items[7].item}：${cart.items[7].price}円 が${cart.items[7].cnt}個 → ${cart.items[7].yen}円<br>
		${cart.items[8].item}：${cart.items[8].price}円 が${cart.items[8].cnt}個 → ${cart.items[8].yen}円<br>
	<h6>総合計金額：未実装</h6>
	<br>
	<form action="ECBuy" method="post">
		<input type="submit" style="width: 70%; height: 70%; font-size: 90px; padding: 30px;" value="俺がガンダムだ！">
	</form>
</body>
</html>