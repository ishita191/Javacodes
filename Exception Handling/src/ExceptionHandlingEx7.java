public class ExceptionHandlingEx7 {
public static void main(String[] args) {
		try {
			String string="123ihjjkk";
            int a=Integer.parseInt(string);
            System.out.println(a);
	              }
            catch(NumberFormatException e) {
	            System.out.println(e);
		}
}
}
//jab error ka exact idea phle s pata nhi hota
//ya runtime par error aata
//har jgh length check krna possible nahi hota jese array m
//unexpected error 
//jvm generated error
//