package two;

public class StarPatternTwo {
    public static void main(String[] args) {

        for (int i = 0; i <5; i++) {

            for (int j = 0; j <= i; j++) {
                char c = (char) (i+65);
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}
