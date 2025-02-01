import java.util.Scanner;

public class PositiveNumber{
	
	public static void main(String[] args){
		
		boolean getNumber= false;
		
		int numb;
		
		do{
			
			System.out.print("Enter Your Number : ");
			numb = new Scanner(System.in).nextInt();
			
			if(numb < 0){
					getNumber = !getNumber;
			}
		}while(!getNumber);
	}
}
