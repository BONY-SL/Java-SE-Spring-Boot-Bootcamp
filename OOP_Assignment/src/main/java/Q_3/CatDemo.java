package Q_3;

public class CatDemo {
    public static void main(String[] args) {

        Cat cat; // legal defined Cat class reference

        Cat [] cats; // legal defined Cat class array reference

        //cat = new Cat[5]; // illegal cat is Cat Class Object reference it cannot
        // initialize Cat Class Array

        cat = new Cat(); // legal

        //cats = new Cat(); // illegal

        cats = new Cat[5]; // legal initializes Cat Type Object Array
    }
}
