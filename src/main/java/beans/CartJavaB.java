package beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CartJavaB implements Serializable{

	// リスト
	private List<ItemJavaB> listItems = new ArrayList<>();
	
	// コンスト
	public CartJavaB() {}
	
	// 動作
	public void addItem(ItemJavaB i) {listItems.add(i);}
	
	// getter
	public List<ItemJavaB> getItems(){return listItems;}
	
	// setter
	public void setItems(List<ItemJavaB> i) {this.listItems = i;}
}
