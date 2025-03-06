package Q_10;

public class ObParm {

    public static void main(String[] args){

        ObParm o = new ObParm();
        o.amethod();

        // 10 0 30

    }
    public void amethod(){

        int i = 99;
        ValHold v = new ValHold();
        v.i=30;
        another(v,i);
        System.out.println(v.i);
// 10 0 20
    }

    public void another(ValHold v, int i){
        i=0;
        v.i = 20;
        ValHold vh = new ValHold();
        v = vh;
        System.out.println(v.i+ " "+i);
    }

}
