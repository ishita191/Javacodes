interface Remote{
	void poweron();
	void powerOff();
	void VolumeUp();
	void VolumeDown();
}

 class TV implements Remote{
	public void poweron() {
		System.out.println("TV on");
	}
	public void powerOff() {
		System.out.println("Tv oFF");
	}
	public void VolumeUp() {
		System.out.println("vpume ON");
	}
	public void VolumeDown() {
		System.out.println("volume FF");
	}
	
}
public class InterfaceRemoteEx {
public static void main(String[] args) {
	TV mytv = new TV();
	mytv.poweron();
	mytv.powerOff();
	
 }
	
}

