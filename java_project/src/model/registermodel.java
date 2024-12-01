package model;

public class registermodel {

		private String fullName;
		private String dateofBirth;
		private String email;
		private String contact;
		private String country;
		private String address;
		private String gender;
		private String username;
		private String Password;
		public registermodel() {
			super();
		
			this.fullName = "";
			this.dateofBirth = "";
			this.email = "";
			this.contact = "";
			this.country = "";
			this.address = "";
			this.gender = "";
			this.username = "";
			this.Password = "";
		}
		
		public registermodel(String fullName, String dateofBirth, String email, String contact,
				String country, String address,String gender, String username, String Password) {
			super();
			
			this.fullName = fullName;
			this.dateofBirth = dateofBirth;
			this.email = email;
			this.contact = contact;
			this.country = country;
			this.address = address;
			this.gender = gender;
			this.username = username;
			this.Password = Password;
		}

	
		public String getFullName() {
			return fullName;
		}

		public void setFullName(String fullName) {
			this.fullName = fullName;
		}

		public String getDateofBirth() {
			return dateofBirth;
		}

		public void setDateofBirth(String dateofBirth) {
			this.dateofBirth = dateofBirth;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getContact() {
			return contact;
		}

		public void setContact(String contact) {
			this.contact = contact;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}
		
		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return Password;
		}

		public void setPassword(String Password) {
			this.Password = Password;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}
		
		@Override
		public String toString() {
			return "registermodel [fullName=" + fullName + ", dateofBirth=" + dateofBirth + ", email=" + email
					+ ", contact=" + contact + ", country=" + country + ", address=" + address + ", gender=" + gender
					+ ", username=" + username + ", Password=" + Password + "]";
		}
}
		
		
		