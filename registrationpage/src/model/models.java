package model;

public class models {


	private String Username;
	private String Password;
	
	
public models(String Username,String Password) {
		super();
		this.setUsername(Username);
		this.setPassword(Password);
}
	
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String toString() {
		return "signin [Username="+Username+",Password="+Password+"]";
	}
	
				}
