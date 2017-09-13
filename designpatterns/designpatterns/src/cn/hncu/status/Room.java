package cn.hncu.status;

public class Room {
	private Status status;
	
	public Room(){
		this.status = new StatusBook();
	}
	
	public void setStatus(Status status) {
		this.status = status;
	}
	
	public void book(){
		status.book(this);
	}
	
	public void checkIn(){
		status.checkIn(this);
	}
	
	public void checkOut(){
		status.checkOut(this);
	}
}
