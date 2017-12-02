import java.util.Scanner;
public class Zadanie6_2 {
	 static int strToInt(String text){
		String kopia="";
		int wynik=0;
		for(int i=0; i<text.length(); i++)
		{
			if(text.charAt(i)>=48 && text.charAt(i)<=57)
			{
				kopia+=text.charAt(i);
				
			}
			else
			{
				break;
			}
		}
		int x=kopia.length()-1;
		int z=0;
			for(;x>=0; x--)
			{
				wynik+=(kopia.charAt(z)-48)*(Math.pow(10,x));
				z++;
			}
		System.out.println(wynik);
		return wynik;	
	}
	public static void main(String[] args) {
	Scanner reader=new Scanner(System.in);
	System.out.print("Ciag znakow: ");
	String text=reader.nextLine();
	strToInt(text);
}

}