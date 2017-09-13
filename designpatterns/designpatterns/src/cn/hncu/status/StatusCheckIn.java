package cn.hncu.status;

public class StatusCheckIn implements Status {
	@Override
	public String getStatus() {
		return "该房间为入住状态...";
	}

	@Override
	public void book(Room room) {
		System.out.println(getStatus());
	}

	@Override
	public void checkIn(Room room) {
		System.out.println(getStatus());
	}

	@Override
	public void checkOut(Room room) {
		room.setStatus(new StatusCheckOut());
		System.out.println("退房成功...");
	}

}
