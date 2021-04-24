import java.util.Scanner;
public class Book {
    String date;
    public void date()
    {
        System.out.println("Date");
        Scanner input = new Scanner(System.in);
        System.out.print("Choose date: ");
        date = input.nextLine();
        System.out.println("Appointmentint date: " + date);
    }

    public void time()
    {
       System.out.println("....................Time.................");
       System.out.println(".                                       .");
       System.out.println(".         1. 10.00am to 12.00am         .");
       System.out.println(".         2. 4.00pm to 6.00pm           .");
       System.out.println(".                                       .");
       System.out.println(".........................................");
    }

    public void recipt1()
    {
        System.out.println("...............................................");
        System.out.println(".\tYour Appointment has been done             .");
        System.out.println(".\tAppointmentint date: "+date+"              .");
        System.out.println(".\tAppointmentint time:  10.00am to 12.00am   .");
        System.out.println("...............................................");
    }
    public void recipt2()
    {
        System.out.println(".............................................");
        System.out.println(".\tYour Appointment has been done           .");
        System.out.println(".\tAppointmentint date: "+date+"            .");
        System.out.println(".\tAppointmentint date:  4.00am to 6.00am   .");
        System.out.println(".............................................");
    }
}
