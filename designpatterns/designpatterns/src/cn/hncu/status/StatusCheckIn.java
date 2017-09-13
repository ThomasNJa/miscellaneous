package cn.hncu.status;

public class StatusCheckIn implements Status {
	@Override
	public String getStatus() {
		return "�÷���Ϊ��ס״̬...";
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
		System.out.println("�˷��ɹ�...");
	}

}
