package cn.hncu.command;

public class Reciever {
	private int currentChannel = 0;

	public int getCurrentChannel() {
		return currentChannel;
	}

	public void setCurrentChannel(int currentChannel) {
		this.currentChannel = currentChannel;
		System.out.println(this.currentChannel);
	}
	
}
