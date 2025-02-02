package two;
public class FactTenToOne {

    public static void main(String[] args) {

        long factorial = 1;

        for (int i = 10 ; i > 0 ; i--){

            if(i != 1){
                System.out.print(i + "*");
            }else {
                System.out.print(i);
            }
            factorial = factorial * i;
        }
        System.out.println();
        System.out.println("Answer :"+factorial);

    }
}
