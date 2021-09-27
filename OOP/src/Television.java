
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
		System.out.println("채널은 "+ channel+ "이고 볼륨은 "+volume+"입니다.");
	}
}
