import java.util.Scanner;
public class Zadanie9_2 {
	static void podziel(String text)
	{
	int n=0;
	for(String temp:text.split(" "))
	{
	n++;
	}
	String[]tab =new String[n];
	int b=0;
	for(String temp:text.split(" "))
	{
		tab[b]=temp;
		b++;
	}
	for(int j=0; j<tab.length;j++)
		{
		System.out.print(tab[j]+", ");
		}
	}
	public static void main(String[] args) {
	Scanner reader=new Scanner(System.in);
	System.out.print("Ciag znakow: ");
	String text=reader.nextLine();
	podziel(text);
}

}