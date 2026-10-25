package beans;

import java.io.Serializable;

public class ItemJavaB implements Serializable{

	// 変数
	private String strItem;
	private int intPrice;
	private int intCnt;
	
	// コンスタ
	public ItemJavaB() {
		// おや、 おきゃくさん それが なにか しりたいって？
		this("ろうやのガキ", 20, 1);
	}
	
	public ItemJavaB(String i, int p, int c) {
		this.strItem = i;
		this.intPrice = p;
		this.intCnt = c;
	}	
	
	// getter
	public String getItem() {return strItem;}
	public int getPrice() {return intPrice;}
	public int getCnt() {return intCnt;}
	public int getYen() {return intPrice * intCnt;}

	// setter
	public void setCnt(int c) {this.intCnt += c;}
	
}
