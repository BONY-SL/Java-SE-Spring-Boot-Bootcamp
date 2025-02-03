public class ArraysSum {

    static int sum;

    public static void main(String[] args) {

        int[] arr1 = {10,20,30,40,50,60};
        int[] arr2 = {1,2,3,4,5};

        ArraysSum arraysSum = new ArraysSum();

        sum = arraysSum.sumOfArraysValues(arr1);
        sum = arraysSum.sumOfArraysValues(arr2);

        System.out.println(sum);

    }

    public int sumOfArraysValues(int[] array){

        for (int j : array) {
            sum = sum + j;
        }
        return sum;
    }
}
