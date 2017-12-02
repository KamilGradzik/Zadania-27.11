import java.util.Scanner;

public class Zadanie1_1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Ciag znakow:");
		String a=reader.nextLine();
		String b=a.toLowerCase();
		int C=0;
		char last = b.charAt(b.length() - 1);
		char B;
		
		for(int c=b.length()-1;c>=0;c--)
		{
			B=b.charAt(c);
			if(B==last)
			{
				C++;
			}
			
		}
			System.out.print("Powtórzenia: "+last+" - "+C);
		
	}

}