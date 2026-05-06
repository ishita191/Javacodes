
public class StringEx6 {

	 public static void main(String[] args) {
		char c[]= {'A','1', 'b',' ','a','0'};
		for(int i=0; i<5; i++)
		{
			i++;
			if(Character.isDigit(c[i]))
				System.out.println(c[i]+" is digit");
			if(Character.isWhitespace(c[i]))
System.out.println(c[i]+"is whitespace");
			if(Character.isUpperCase(c[i]))
				System.out.println(c[i]+"is uppercase");
			if(Character.isLowerCase(c[i]))
System.out.println(c[i]+" is lowercase");
			i++;
		}
	}
	 
 }

