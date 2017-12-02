import java.util.Scanner;

public class Zadanie6_1 {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.print("Tekst jawny:");
		String A=reader.nextLine();
		String X=A.toLowerCase();
		System.out.print("Przesuniecie:");
		int B=reader.nextInt();
		String szyfr="";
		int Zn=0;
			for(int i=0; i<A.length(); i++)
				{
				if(X.charAt(i)==32)
				{
				Zn=X.charAt(i);
				}
				else {
				Zn=X.charAt(i)+B;
				
				if(Zn<97)
					{
					Zn=97-Zn;
					Zn=123-Zn;
					}
				if(Zn>122)
				{
				Zn=96+B;
				}
				
				}
				szyfr+=(char)Zn;
				}
		System.out.print(szyfr);
		
}
}