package model;

public class reservationmodel {
	
    
    private int managerid;
	private String roomtype;
	private String roomservice;
	private String floornumber;
	private String membernumber;
	private String type;
	private String ServiceName;
	private String Arrival;
	private String Departure;
	

	public reservationmodel() {
			super();
		
			
			
			this.managerid= 0;
			this.roomtype = "";
			this.roomservice = "";
			this.floornumber = "";
			this.membernumber = "";
			this.type = "";
			this.ServiceName = "";
			this.Arrival = "";
			this.Departure = "";
		}
		
		public reservationmodel( int managerid, String roomtype, String roomservice, String floornumber, String membernumber, String type, String ServiceName, String arrival, String departure) {
		super();
		this.managerid = managerid;
		this.roomtype = roomtype;
		this.roomservice = roomservice;
		this.floornumber = floornumber;
		this.membernumber = membernumber;
		this.type = type;
		this.ServiceName = ServiceName;
		this.Arrival = arrival;
		this.Departure = departure;
	}

	public String getRoomtype() {
		return roomtype;
	}

	public void setRoomtype(String roomtype) {
		this.roomtype = roomtype;
	}

	public String getRoomservice() {
		return roomservice;
	}

	public void setRoomservice(String roomservice) {
		this.roomservice = roomservice;
	}

	public String getFloornumber() {
		return floornumber;
	}

	public void setFloornumber(String floornumber) {
		this.floornumber = floornumber;
	}

	public String getMembernumber() {
		return membernumber;
	}

	public void setMembernumber(String membernumber) {
		this.membernumber = membernumber;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public String getServiceName() {
		return ServiceName;
	}

	public void setServiceName(String serviceName) {
		this.ServiceName = serviceName;
	}
	
	public String getArrival() {
		return Arrival;
	}
	
	public void setArrival(String arrival) {
		this.Arrival = arrival;
	}
	
	public String getDeparture() {
		return Departure;
	}
	
	public void setDeparture(String departure) {
		this.Departure = departure;
	}
	

	public int getManagerid() {
		return managerid;
	}

	public void setManagerid(int managerid) {
		this.managerid = managerid;
	}
	@Override
	public String toString() {
		return "reservationmodel [managerid=" + managerid
				+ ", roomtype=" + roomtype + ", roomservice=" + roomservice + ", floornumber=" + floornumber
				+ ", membernumber=" + membernumber + ", type=" + type + ", ServiceName=" + ServiceName + ", Arrival="
				+ Arrival + ", Departure=" + Departure + "]";
}}
