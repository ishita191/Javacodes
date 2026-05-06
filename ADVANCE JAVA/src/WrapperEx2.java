
public class WrapperEx2 {
public static void main(String[] args) {
	Integer ab = new Integer(4); // @Deprecated in java 9version
	System.out.println(ab);
	Integer a =3; //  Auto boxing in java5 (JDK 1.5) version
	System.out.println(a);
  //  int aa = a.intValue(); // Un boxing
//System.out.println(aa);
int aa=a;
System.out.println(aa);

}
}
