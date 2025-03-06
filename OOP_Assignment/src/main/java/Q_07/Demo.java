package Q_07;

public class Demo {

    int a =10;
    static int b=20;

    public static void main(String[] args) {

        int c=20;
        Demo ob=new Demo();
        //System.out.println(a); //Error 1
        System.out.println(b); //Line 2
        System.out.println(c); //Line 3
        //System.out.println(Demo.a); //Error 4
        System.out.println(Demo.b); //Line 5
        //System.out.println(Demo.c); //Error 6
        System.out.println(ob.a); //Line 7
        System.out.println(ob.b); //Line 8
        //System.out.println(ob.c); //Error 9
    }
}
