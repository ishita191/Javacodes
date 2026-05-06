interface google{
	void search();
}
interface youtube{
	void display();
}
interface instagram{
	void reelscroll();
}
class Phone implements google,youtube,instagram{
	public void search(){
		System.out.println("google search bar");
	}
	public void display() {
		System.out.println("youtube play video");
	}
	public void reelscroll(){
		System.out.println("instgram reel scroll");
	}
}
public class MultipleInterface {
	public static void main(String[] args) {
		Phone phone= new Phone();
		phone.display();
		phone.reelscroll();
		phone.search();
		
	}

}
