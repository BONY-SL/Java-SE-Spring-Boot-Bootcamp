package three.ticketbook;

import java.util.ArrayList;
import java.util.Scanner;

public class DemoBooking {

    static ArrayList<TicketBooking> ticketBookings = new ArrayList<>();

    public static void main(String[] args) {

        initializeMovies();

        int choice;
        while (true) {
            System.out.println("***Select Movie***");
            System.out.println("[0] Avatar\n[1] Titanic\n[2] Inception\n[3]Exit\n");

            System.out.print("Select Move or Exit : ");
            choice = new Scanner(System.in).nextInt();

            switch (choice) {
                case 3:
                    System.exit(1);
                case 0:
                case 1:
                case 2:
                    System.out.println("Have " + ticketBookings.get(choice).getSeatLimit() + " Seats Avalable");
                    DemoBooking demoBooking = new DemoBooking();
                    demoBooking.bookTicket(choice);
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }
    }
    private static void initializeMovies() {

        TicketBooking moveOne = new TicketBooking();
        moveOne.setMoveName("Avatar");
        moveOne.setSeatLimit(50);
        ticketBookings.add(moveOne);

        TicketBooking moveTwo = new TicketBooking();
        moveTwo.setMoveName("Titanic");
        moveTwo.setSeatLimit(50);
        ticketBookings.add(moveTwo);

        TicketBooking moveThree = new TicketBooking();
        moveThree.setMoveName("Inception");
        moveThree.setSeatLimit(50);
        ticketBookings.add(moveThree);
    }

    private void bookTicket(int choice) {

        int isBookTicket;

        String  isBook;

        System.out.print("Do You Like Book a Ticket for "+ticketBookings.get(choice).getMoveName()+" Movie");
        System.out.println("yes or no (Press y/n)");
        isBook = new Scanner(System.in).nextLine();

        if(isBook.equalsIgnoreCase("y")){

            while(true){
                System.out.println("Please How Many Tickets do you Want : ");
                isBookTicket = new Scanner(System.in).nextInt();

                if(isBookTicket > ticketBookings.get(choice).getSeatLimit()){
                    System.out.println("Can not Book....Current Have "+ticketBookings.get(choice).getSeatLimit()+" available");
                }else {
                    TicketBooking ticketBooking = ticketBookings.get(choice);
                    ticketBooking.setSeatLimit(ticketBooking.getSeatLimit()-isBookTicket);
                    ticketBookings.set(choice,ticketBooking);
                    System.out.println("Ticket Book Success !");
                    main(null);
                    break;
                }
            }


        } else if (isBook.equalsIgnoreCase("n")) {
            main(null);
        }
    }
}
