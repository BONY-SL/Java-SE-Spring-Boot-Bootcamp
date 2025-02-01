public class CopyCharArray{
	public static void main(String[] args){
		
		char [] originalArray = {'a','e','i','o','u'};
		
		char copyArray [] = new char[originalArray.length];
		
		for(int i = 0 ; i < originalArray.length ; i++){
			
			copyArray[i] = originalArray[i];
		}
		
		for(char c : copyArray){
			
			System.out.print(c + " ");
		}
	}
}
