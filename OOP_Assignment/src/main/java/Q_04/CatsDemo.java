package Q_04;

import java.util.Arrays;

public class CatsDemo {

    public static void main(String[] args) {
        
        Cats[] cats = {
            new Cats("Aldo"),
            new Cats("Bear"),
            new Cats("Toby"),
            new Cats("Teddy"),
            new Cats("Henry"),
        };
      
        System.out.println(Arrays.toString(cats));
    }


    
}
