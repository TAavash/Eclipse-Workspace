package m;

public class model {

private String username;
private String password;
private String confPassword;
public model() {
	super();
	this.username = "";
	this.password = "";
	this.confPassword = "";
}
public model(String username, String password, String confPassword) {
	super();
	this.username = username;
	this.password = password;
	this.confPassword = confPassword;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getConfPassword() {
	return confPassword;
}
public void setConfPassword(String confPassword) {
	this.confPassword = confPassword;
}
@Override
public String toString() {
	return "newUserNameModel [username=" + username + ", password=" + password + ", confPassword=" + confPassword + "]";
}


}
