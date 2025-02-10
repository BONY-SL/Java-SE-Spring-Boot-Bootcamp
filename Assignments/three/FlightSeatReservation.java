package three;

import java.util.Scanner;

public class FlightSeatReservation {

    public static void main(String[] args) {

        int[] flightSeats = new int[10];

        int seatNumber;
        int count;

        while (true){
            System.out.print("Enter Sheet Number Like To You Booking (1 to 10) : ");
            seatNumber = new Scanner(System.in).nextInt();

            if(flightSeats[(seatNumber-1)] == 1){
                System.out.println("It is Already Booked...");
            }else {
                flightSeats[(seatNumber-1)] = 1;
                System.out.println("Your Seat Booked Success...");
                System.out.println("Available Book Numbers ");
                for (int i = 0; i < 10; i++) {
                    if(flightSeats[i] == 0){
                        System.out.print((i+1)+",");
                    }
                }
                System.out.println();
            }
            count = 0;
            for (int i = 0; i < 10; i++) {
                if(flightSeats[i] == 1){
                    count++;
                }
            }
            if(count == 10)
                break;
        }

    }
}
