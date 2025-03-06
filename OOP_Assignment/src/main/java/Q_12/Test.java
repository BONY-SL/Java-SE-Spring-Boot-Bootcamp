package Q_12;

public class Test {

    int x=10;
    static int y=20;

    static void staticMethod(){

    }
    void instanceMethod(){

    }

    void mA(){
        System.out.println(x);
        System.out.println(y);
        staticMethod();
        instanceMethod();
    }

    static void mB(){
        //System.out.println(x); //error
        System.out.println(y);
        staticMethod();
        //instanceMethod(); //error
    }
}
