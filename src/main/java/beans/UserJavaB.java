package beans;

import java.io.Serializable;

public class UserJavaB implements Serializable{
	
	// 変数
	private String strUser;
	private String strPw;
	
	// コンスト
	public UserJavaB() {
		this("root", "qwerty");
	}
	
	public UserJavaB(String u, String p) {
		this.strUser = u;
		this.strPw = p;
	}
	
	// getter
	public String getUser() {return strUser;}
	public String getPw() {return strPw;}

	// setter
	public void setUesr(String u) {this.strUser = u;}
	public void setPw(String p) {this.strPw = p;}
	
}
