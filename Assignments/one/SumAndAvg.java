package one;

import java.util.*;
public class SumAndAvg{

	public static void main(String[] args){
		
		int[] array = {50,25,85,97,75,84,62,78,92};
		double sum = 0;
		double avg = 0;
		
		for(int i = 0 ; i < array.length ; i++){
			
			sum = sum + array[i];
		}
		
		avg = sum/(array.length);
		
		System.out.println("Total : "+sum);
		System.out.println("Average : "+avg);
		
		System.out.println(4+3+2);
		System.out.println("4"+"3"+"2");
		System.out.println('4'+'3'+'2');
		System.out.println('4'+" "+'3'+" "+'2');
		System.out.println('A'+'B'+'C');
		System.out.println("A"+"B"+"C");
		System.out.println('A'+100+200);
		System.out.println('A'+" "+'B'+" "+'C');


		int x=100,y;
		y=++x;
		System.out.println(x+" "+y);
		y=++x;
		System.out.println(x+" "+y);
		y=++x;
		System.out.println(x+" "+y);
		
		int x2=100,y2;
		y2=x2++;
		System.out.println(x2+" "+y2);
		y2=x2++;
		System.out.println(x2+" "+y2);
		y2=x2++;
		System.out.println(x2+" "+y2);
		
	}
}
