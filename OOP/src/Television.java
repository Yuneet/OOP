
public class Television {
	private int channel;
	private int volume;
	boolean onOff;
	
	

	int getChannel() {
		return channel;
	}
	
	int getVolume() {
		return volume;
	}
	
	void setChannel(int channel) {
		this.channel = channel;
	}
	
	void setVolume(int volume) {
		this.volume = volume;
	}




	void print() {
		System.out.println("ä���� "+ channel+ "�̰� ������ "+volume+"�Դϴ�.");
	}
}
