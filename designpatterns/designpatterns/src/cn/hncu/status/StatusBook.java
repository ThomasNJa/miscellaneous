package cn.hncu.status;

public class StatusBook implements Status {

	@Override
	public String getStatus() {
		return "��ǰ������Ԥ��...";
	}

	@Override
	public void book(Room room) {
		System.out.println(getStatus());
	}

	@Override
	public void checkIn(Room room) {
		room.setStatus(new StatusCheckIn());
		System.out.println("��ס�ɹ�...");
	}

	@Override
	public void checkOut(Room room) {
		room.setStatus(new StatusCheckOut());
		System.out.println("�˷��ɹ�...");
	}

}
