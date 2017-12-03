import java.util.Scanner;
public class Zadanie4_2 {
	 static String flipCase(String text){
		String kopia="";
		int p=32;
		for(int i=0; i<text.length(); i++)
		{
			if(text.charAt(i)==32)
			{
			kopia+=text.charAt(i);
			}
			if(text.charAt(i)>=97 && text.charAt(i)<=122)
			{
				kopia+=(char)(text.charAt(i)-p);
			}	
			if(text.charAt(i)>=65 && text.charAt(i)<=90)
			{
				kopia+=(char)(text.charAt(i)+p);
			}	
		}
		return kopia;	
	}
	public static void main(String[] args) {
	Scanner reader=new Scanner(System.in);
	System.out.print("Ciag znakow: ");
	String text=reader.nextLine();
	System.out.print(flipCase(text));
}

}