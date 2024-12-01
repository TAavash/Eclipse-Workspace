package model;

public class paymentmodel {

	private String Cardtype;
	private String Cardnumber;
	private String Cardexpiry;
	private String Securitycode;
	

	public paymentmodel() {
			super();
		
			this.Cardtype = "";
			this.Cardnumber = "";
			this.Cardexpiry = "";
			this.Securitycode = "";
		}
		
		public paymentmodel(String cardtype, String cardnumber, String cardexpiry, String securitycode) {
		super();
		Cardtype = cardtype;
		Cardnumber = cardnumber;
		Cardexpiry = cardexpiry;
		Securitycode = securitycode;
	}


		public String getCardtype() {
			return Cardtype;
		}

		public void setCardtype(String cardtype) {
			Cardtype = cardtype;
		}

		public String getCardnumber() {
			return Cardnumber;
		}

		public void setCardnumber(String cardnumber) {
			Cardnumber = cardnumber;
		}

		public String getCardexpiry() {
			return Cardexpiry;
		}

		public void setCardexpiry(String cardexpiry) {
			Cardexpiry = cardexpiry;
		}

		public String getSecuritycode() {
			return Securitycode;
		}

		public void setSecuritycode(String securitycode) {
			Securitycode = securitycode;
		}

		@Override
		public String toString() {
			return "paymentmodel [Cardtype=" + Cardtype + ", Cardnumber=" + Cardnumber + ", Cardexpiry=" + Cardexpiry
					+ ", Securitycode=" + Securitycode + "]";
		}

}
