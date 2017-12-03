import java.util.Scanner;
public class Zadanie5_2 {
	 static boolean startWith(String str1, String str2){
		 if(str1.startsWith(str2)==true)
		 {

			 return true; 
		 }
		 else
		 {
			 return false;
		 }
	}
	public static void main(String[] args) {
	Scanner reader=new Scanner(System.in);
	System.out.print("Ciag znakow: ");
	String str1=reader.nextLine();
	System.out.print("Ciag znakow 2: ");
	String str2=reader.nextLine();
	System.out.println(startWith(str1, str2));
}

}