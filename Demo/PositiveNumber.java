import java.util.Scanner;

public class PositiveNumber{
	
	public static void main(String[] args){
		
		boolean getNumber= false;
		
		int numb;
		int total=0;
		
		do{
			
			System.out.print("Enter Your Number : ");
			numb = new Scanner(System.in).nextInt();
			
			if(numb < 0){
					getNumber = !getNumber;
			}else{
				total = total + numb;
			}
		}while(!getNumber);
		
		System.out.println("Total is :" + total);
	}
}
