package Q_05;

public class MyClass {

    MyClass(){

        System.out.println("MyClass()");
    }

    MyClass(int i){

        this(i,i);
        System.out.println("MyClass(int)");
    }
    
    MyClass(int i,int j){

        this();
        System.out.println("MyClass(int,int)");
    } 

}
