package one;

import java.util.*;

public class ConvertToGrames{

	public static void main(String[] args){
		
		double ounces;
		
		System.out.print("Enter Input : ");
		ounces = new Scanner(System.in).nextInt();
		
		System.out.println("Converted Value in Grames :"+(ounces*28.3495));
		
	}
}
