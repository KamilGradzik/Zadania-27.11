import java.util.Scanner;

public class Zadanie2_1 {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.println("Ciag znakow:");
		String a=reader.nextLine();
		String nowe = "";	
		for(int c= a.length() - 1; c >= 0; c--)
		{
			nowe = nowe.concat(a.substring(c, c + 1));
		}
		System.out.print(nowe);

	}

}