public class CountOfIntegerNumbersInTheArray {

    public static void main(String[] args) {

        int[] arr1 = {10,25,30,40,53,64};
        int[] arr2 = {1,2,3,4,5};

        int arrayOneIntegerCount;
        int arrayTwoIntegerCount;

        CountOfIntegerNumbersInTheArray array = new CountOfIntegerNumbersInTheArray();

        arrayOneIntegerCount = array.numberOfIntegers(arr1);
        arrayTwoIntegerCount = array.numberOfIntegers(arr2);

        System.out.println(arrayOneIntegerCount);
        System.out.println(arrayTwoIntegerCount);
    }

        public int numberOfIntegers(int[] array) {

            int count = 0;
            for (int j : array) {
                if (j % 2 == 0)
                    count++;
            }
            return count;
        }
}
