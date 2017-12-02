import java.util.Scanner;

public class Zadanie5_1 {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.print("Ciag znakow:");
		String a=reader.nextLine();
		int LN=0;
		int PN=0;
		for(int i=0; i<a.length();i++)
		{
			if(a.charAt(i)==40)
				{
				LN++;
				}
			if(a.charAt(i)==41)
				{
				PN++;
				}
			
		}
		if(LN==PN)
		{
			System.out.print("Nawiasy poprawnie");
		}
		else
		{
			System.out.print("Nawiasy niepoprawnie");
		}
		
	}

}