import java.util.Scanner;

public class Zadanie4_1 {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.print("Ciag znakow:");
		String a=reader.nextLine();
		int Suma=0;
		for(int i=0; i<a.length();i++)
		{
			if(Character.isDigit(a.charAt(i)))
				{
				Suma+=a.charAt(i)-48;
				}
			
		}
		System.out.print("Suma liczb: "+Suma);
		
	}

}