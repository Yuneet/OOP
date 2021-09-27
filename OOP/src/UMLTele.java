
public class UMLTele {
	private boolean isOn;
	private int volume;
	private int channel;
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	
	public void turnOn() {
		isOn = true;
	}
	
	public void turnOff() {
		isOn = false;
	}
	@Override
	public String toString() {
		return "UMLTele [isOn=" + isOn + ", volume=" + volume + ", channel=" + channel + "]";
	}
	
}
