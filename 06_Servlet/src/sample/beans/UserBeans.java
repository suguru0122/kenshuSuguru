package sample.beans;

public class UserBeans {

	private String username;
	private String address;
	private String phone;

	// チェック処理
	public void checkValues(){
		if(username != null && address != null && phone != null){
			username += "(チェック済み)";
		}
	}

	// セッター
	public void setUsername(String username){
		this.username = username;
	}
	public void setAddress(String address){
		this.address = address;
	}
	public void setPhone(String phone){
		this.phone = phone;
	}

	// ゲッター
	public String getUsername(){
		return this.username;
	}
	public String getAddress(){
		return this.address;
	}
	public String getPhone(){
		return this.phone;
	}
}
