package cn.hncu.status;

public interface Status {
	public String getStatus();
	public void book(Room room);
	public void checkIn(Room room);
	public void checkOut(Room room);
}
