public class StaticDemo {
    static int A = 2025;

    static {
        callA();
        callB();
    }

    public static void callA() {
        System.out.print(A + " ");
    }

    public static void callB() {
        System.out.print(B + " ");
    }

    static int B = 2024;

    public static void main(String[] args) {
    }
}
