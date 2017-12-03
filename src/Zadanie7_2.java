import java.util.Scanner;
public class Zadanie7_2 {
	static int strFind(String gdzie, String co)
	{
	int wynik=-1;
	int spacje=0;
	int i=0;
	for(String temp:gdzie.split(" "))
	{
		if(temp.equals(co))
		{
			wynik=i+spacje;
			break;
		}
		else
		{
		++spacje;
		i+=temp.length();
		}
	}
		
	return wynik;
	}
	public static void main(String[] args) {
	Scanner reader=new Scanner(System.in);
	System.out.print("Ciag znakow: ");
	String gdzie=reader.nextLine();
	System.out.print("Ciag znakow 2: ");
	String co=reader.nextLine();
	System.out.println(strFind(gdzie, co));
}

}