import java.util.Scanner;

public class Zadanie3_1 {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.println("Ciag znakow:");
		String a=reader.nextLine();
		String nowe = "";	
		String x,y;
		for(int c= a.length() - 1; c >= 0; c--)
		{
			nowe = nowe.concat(a.substring(c, c + 1));
		}
		x=a.replace(" ","");
		y=nowe.replace(" ","");
		
		if(x.equalsIgnoreCase(y))
		{
			System.out.print("Jest palindromem!");
		}
		else
		{
			System.out.print("Nie jest palindromem!");
		}
		

	}

}