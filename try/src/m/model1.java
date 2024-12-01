package m;

public class model1 {

		private String fullName;
		private String dateofBirth;
		private String email;
		private String contact;
		private String country;
		private String address;
		private String postCode;
		public model1() {
			super();
		
			this.fullName = "";
			this.dateofBirth = "";
			this.email = "";
			this.contact = "";
			this.country = "";
			this.address = "";
			this.postCode = "";
		}
		
		public model1(String fullName, String dateofBirth, String email, String contact,
				String country, String address, String postCode) {
			super();
			
			this.fullName = fullName;
			this.dateofBirth = dateofBirth;
			this.email = email;
			this.contact = contact;
			this.country = country;
			this.address = address;
			this.postCode = postCode;
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

		public String getPostCode() {
			return postCode;
		}

		public void setPostCode(String postCode) {
			this.postCode = postCode;
		}

		@Override
		public String toString() {
			return "registermodel" + " fullName=" + fullName + ", dateofBirth=" + dateofBirth
					+ ", email=" + email + ", contact=" + contact + ", country=" + country + ", address=" + address
					+ ", postCode=" + postCode + "]";
		}
		
		
}
		
		
		