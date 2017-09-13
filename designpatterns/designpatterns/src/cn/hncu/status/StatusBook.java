package cn.hncu.status;

public class StatusBook implements Status {

	@Override
	public String getStatus() {
		return "当前房间已预定...";
	}

	@Override
	public void book(Room room) {
		System.out.println(getStatus());
	}

	@Override
	public void checkIn(Room room) {
		room.setStatus(new StatusCheckIn());
		System.out.println("入住成功...");
	}

	@Override
	public void checkOut(Room room) {
		room.setStatus(new StatusCheckOut());
		System.out.println("退房成功...");
	}

}
