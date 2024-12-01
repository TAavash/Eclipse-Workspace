package models;

public class model {

		private int sid;
	private String Name;
	private String Course;
	
	public model() {

						this.setSid(0);
						this.setName("");
						this.setCourse("");
					}
	public model(int sid, String Name,String Course) {
						super();
						this.setSid(sid);
						this.setName(Name);
						this.setCourse(Course);
						
						
					}
	public int getSid() {
						return sid;
					}
	public void setSid(int sid) {
						this.sid = sid;
					}
	public String getName() {
						return Name;
					}
	public void setName(String name) {
						Name = name;
					}
	public String getCourse() {
						return Course;
					}
	public void setCourse(String course) {
						Course = course;
					}
					
	public String toString() {
						return "Student [sid="+ sid+",Name="+Name+",Course="+Course+"]";
					}

				}
