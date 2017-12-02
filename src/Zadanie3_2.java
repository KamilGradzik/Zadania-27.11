import java.util.Scanner;
public class Zadanie3_2 {
	 static int strpos(String text,char z){
		int index = 0;
		for(int i=0; i<text.length(); i++)
		{
			if(text.charAt(i)==z)
			{
				index=i;
			}			
		}
		System.out.print(index);
		return index;	
	}
	public static void main(String[] args) {
	Scanner reader=new Scanner(System.in);
	System.out.print("Ciag znakow: ");
	String text=reader.nextLine();
	System.out.print("Znak: ");
	String y=reader.nextLine();
	char z=y.charAt(0);
	strpos(text,z);
}

}