import java.util.Scanner;
public class Zadanie11_2 {
	static String strcut(String text, int start, int ile)
	{
	String A="";
	String B="";
	int j=start+ile;
	for(int i=0; i<start;i++)
		{
		A+=text.charAt(i);
		}
	for(;j<text.length();j++)
	{
	B+=text.charAt(j);
	}
	String wynik=A+B;
	return wynik;
	}
	public static void main(String[] args) {
	Scanner reader=new Scanner(System.in);
	System.out.print("Ciag znakow: ");
	String text=reader.nextLine();
	System.out.print("Miejsce wyciecia:");
	int start=reader.nextInt();
	System.out.print("ile do wyciecia:");
	int ile=reader.nextInt();
	System.out.println(strcut(text, start, ile));
}

}