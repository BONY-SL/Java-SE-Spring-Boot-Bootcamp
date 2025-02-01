import java.util.Scanner;

public class SumArray{
	
	public static void main(String[] args){
		
		System.out.print("Enter Size of Array :");
		
		int arraySize = new Scanner(System.in).nextInt();
		
		int[] array = new int[arraySize];
		int total=0;
		
		for(int i = 0 ; i < arraySize; i++){
			
			System.out.print("Enter Number "+(i+1)+":");
			
			array[i] = new Scanner(System.in).nextInt();
			total = total + array[i];
		}
		
		System.out.print("Sum Of Array :"+ total);
	}
	
}

