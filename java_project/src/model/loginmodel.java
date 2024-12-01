package model;

public class loginmodel {

		private int customerid;
		private String username;
		private String password;
		
		public loginmodel() {
			super();
			this.setCustomerid(0);
			this.username = "";
			this.password = "";
		}

		public loginmodel(String username, String password) {
			super();
			this.username = username;
			this.password = password;
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

		@Override
		public String toString() {
			return "loginmodel [customerid=" + customerid + ", username=" + username + ", password=" + password + "]";
		}

		public int getCustomerid() {
			return customerid;
		}

		public void setCustomerid(int customerid) {
			this.customerid = customerid;
		}

	
}		