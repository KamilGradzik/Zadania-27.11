import java.util.Scanner;
public class Zadanie8_2 {
	static int wordCount(String text)
	{
	int wynik=0;
	for(String temp:text.split(" "))
	{
	wynik++;
	}
	return wynik;
	}
	public static void main(String[] args) {
	Scanner reader=new Scanner(System.in);
	System.out.print("Ciag znakow: ");
	String text=reader.nextLine();
	System.out.println(wordCount(text));
}

}