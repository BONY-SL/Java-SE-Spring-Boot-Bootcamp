package three.ticketbook;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo {

    static ArrayList<TicketBooking> ticketBookings = new ArrayList<>();

    public static void main(String[] args) {


        TicketBooking moveOne = new TicketBooking();
        moveOne.setMoveName("Avatar");
        moveOne.setSeatLimit(50);
        ticketBookings.add(moveOne);

        TicketBooking moveTwo = new TicketBooking();
        moveTwo.setMoveName("Titanic");
        moveTwo.setSeatLimit(50);
        ticketBookings.add(moveTwo);

        TicketBooking moveTree = new TicketBooking();
        moveTree.setMoveName("Inception");
        moveTree.setSeatLimit(50);
        ticketBookings.add(moveTree);

        int choice;
        int getTicket;
        while (true){
            System.out.println("***Select Movie***");
            System.out.println("[1] Avatar\n[2] Titanic\n[3] Inception\n[0]Exit\n");

            System.out.print("Select Move or Exit : ");
            choice = new Scanner(System.in).nextInt();

            switch (choice){
                case 4:
                    System.exit(1);
                case 0:
                case 1:
                case 2:
                    System.out.println("Have " +ticketBookings.get(choice).getSeatLimit()+" Seats Avalable");
                    Demo demo = new Demo();
                    // demo.bookTicket(choice);
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }
    }
}
