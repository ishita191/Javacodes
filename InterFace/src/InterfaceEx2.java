interface demo{
	 static int x=10;
}
interface demo1{
static	int x=20;
	
}
class Demo3 implements demo,demo1{
 int x=30;//45
 void show() {
	 System.out.println(x);//30//45
	 System.out.println(demo.x);//10
	 System.out.println(demo1.x);//20
 }
}
public class InterfaceEx2 {
public static void main(String[] args) {
	System.out.println(demo.x);//10 ,30,10,20,45,10,20
	Demo3 c= new Demo3();
	
	c.show();
	c.x=45;
	c.show();
	
}
}
