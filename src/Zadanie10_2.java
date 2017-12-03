import java.util.Scanner;
public class Zadanie10_2 {
	static int strFindAndCount(String gdzie, String co)
	{
	int wynik=0;
	for(String temp:gdzie.split(" "))
	{
		if(temp.contains(co))
		{
			wynik++;
			if(temp.endsWith(co))
				{
				wynik++;
				}
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
	System.out.println(strFindAndCount(gdzie, co));
}

}