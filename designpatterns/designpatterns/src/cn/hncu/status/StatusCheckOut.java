package cn.hncu.status;

public class StatusCheckOut implements Status{
	@Override
	public String getStatus() {
		return "当前房间为空闲状态...";
	}

	@Override
	public void book(Room room) {
		room.setStatus(new StatusBook());
		System.out.println("订房成功...");
	}

	@Override
	public void checkIn(Room room) {
		room.setStatus(new StatusCheckIn());
		System.out.println("入住成功...");
	}

	@Override
	public void checkOut(Room room) {
		System.out.println(getStatus());
	}
	
}
