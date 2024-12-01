package model;

import controller.logincontroller;

public class control {
private loginmodel user;

	

	public control() {

		this.user=new loginmodel();

	}

	

	public control(loginmodel user) {

		this.user=user;

	}

	public loginmodel getUser() {

		return user;

	}

	public void setUser(loginmodel user) {

		this.user = user;

	}

	

	public void login() {

		this.user = new logincontroller().login(this.user);

	}

}
