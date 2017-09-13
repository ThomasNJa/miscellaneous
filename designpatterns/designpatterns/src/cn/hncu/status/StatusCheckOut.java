package cn.hncu.status;

public class StatusCheckOut implements Status{
	@Override
	public String getStatus() {
		return "��ǰ����Ϊ����״̬...";
	}

	@Override
	public void book(Room room) {
		room.setStatus(new StatusBook());
		System.out.println("�����ɹ�...");
	}

	@Override
	public void checkIn(Room room) {
		room.setStatus(new StatusCheckIn());
		System.out.println("��ס�ɹ�...");
	}

	@Override
	public void checkOut(Room room) {
		System.out.println(getStatus());
	}
	
}
