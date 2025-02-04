package two;

import java.util.Scanner;

public class AdventureCamp {



    public static void main(String[] args) {

        int time;

        System.out.print("Enter Time : ");
        time = new Scanner(System.in).nextInt();

        if(time >= 18  || time < 6){
            System.out.println("Campfire");
        } else if (12 <= time && time < 18 ){
            System.out.println("Hiking");
        }else if (6 <= time && time <12) {
            System.out.println("Bird Watching");
        }
    }
}
