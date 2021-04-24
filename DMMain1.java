import java.util.Scanner;

// OKay mama

public class DMMain1 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int option1, option2, option3, option4, option5, option6, option7, option8, option9, option10, option11, option12, option13, option14, option15, option16, option17, option18, option19, option20, option21, option22, option23, option24, option25, option26, option27, option28, option29, option30, option31, option32, option33, option34, option35, option36, option37, option38, option39;
    String date, time;
    int a;
    boolean ok = true;

    Start obj = new Start();

    do {
      obj.selectBranch();
      System.out.print("Select your Branch: ");
      option1 = input.nextInt();
      switch (option1) {
        case 1:
          System.out.println("\n -->>Your selected branch is Dhaka \n");
          obj.Menu();
          System.out.print("Choose Option: ");
          option2 = input.nextInt();
          switch (option2) {
            case 1:
              obj.Section();
              obj.Catagory();
              System.out.print("Choose Option: ");
              option3 = input.nextInt();
              switch (option3) {
                case 1:
                  obj.Cardiology();
                  System.out.print("Choose Option: ");
                  option4 = input.nextInt();
                  switch (option4) {
                    case 1:
                      System.out.println("Dr. Jitu ");
                      obj.date();
                      obj.time();
                      System.out.print("Choose time: ");
                      option5 = input.nextInt();
                      switch (option5) {
                        case 1:
                          obj.recipt1();
                          break;
                        case 2:
                          obj.recipt2();
                          break;
                      }
                      break;
                    case 2:
                      System.out.println("Dr. Saif ");
                      obj.date();
                      obj.time();
                      System.out.print("Choose time: ");
                      option6 = input.nextInt();
                      switch (option6) {
                        case 1:
                          obj.recipt1();
                          break;
                        case 2:
                          obj.recipt2();
                          break;
                      }
                      break;
                    case 3:
                      obj.date();
                      obj.time();
                      System.out.print("Choose time: ");
                      option7 = input.nextInt();
                      switch (option7) {
                        case 1:
                          obj.recipt1();
                          break;
                        case 2:
                          obj.recipt2();
                          break;
                      }
                      break;
                  }
                  break;
                case 2:
                  obj.Dental();
                  System.out.print("Choose Option: ");
                  option8 = input.nextInt();
                  switch (option8) {
                    case 1:
                      System.out.println("Dr. Hakim ");
                      obj.date();
                      obj.time();
                      System.out.print("Choose time: ");
                      option9 = input.nextInt();
                      switch (option9) {
                        case 1:
                          obj.recipt1();
                          break;
                        case 2:
                          obj.recipt2();
                          break;
                      }
                      break;
                    case 2:
                      System.out.println("Dr. Hasan ");
                      obj.date();
                      obj.time();
                      System.out.print("Choose time: ");
                      option10 = input.nextInt();
                      switch (option10) {
                        case 1:
                          obj.recipt1();
                          break;
                        case 2:
                          obj.recipt2();
                          break;
                      }
                      break;
                    case 3:
                      System.out.println("Dr. Ahmed ");
                      obj.date();
                      obj.time();
                      System.out.print("Choose time: ");
                      option11 = input.nextInt();
                      switch (option11) {
                        case 1:
                          obj.recipt1();
                          break;
                        case 2:
                          obj.recipt2();
                          break;
                      }
                      break;
                  }
                  break;
                case 3:
                  obj.Diabetic();
                  System.out.print("Choose Option: ");
                  option12 = input.nextInt();
                  switch (option12) {
                    case 1:
                      System.out.println("Dr. Saimon ");
                      obj.date();
                      obj.time();
                      System.out.print("Choose time: ");
                      option13 = input.nextInt();
                      switch (option13) {
                        case 1:
                          obj.recipt1();
                          break;
                        case 2:
                          obj.recipt2();
                          break;
                      }
                      break;
                    case 2:
                      System.out.println("Dr. Nazmul Islam ");
                      obj.date();
                      System.out.print("Choose time: ");
                      option14 = input.nextInt();
                      switch (option14) {
                        case 1:
                          obj.recipt1();
                          break;
                        case 2:
                          obj.recipt2();
                          break;
                      }
                      break;
                    case 3:
                      System.out.println("Dr. Chowdhury ");
                      obj.date();
                      obj.time();
                      System.out.print("Choose time: ");
                      option15 = input.nextInt();
                      switch (option15) {
                        case 1:
                          obj.recipt1();
                          break;
                        case 2:
                          obj.recipt2();
                          break;
                      }
                  }
                  break;
              }
              break;
            case 2:
              System.out.println("Test");
              System.out.println(".........Menu...........");
              System.out.println(" 1. New Test    ");
              System.out.println(" 2. Test report ");
              System.out.print("Choose Option: ");
              option30 = input.nextInt();
              switch (option30) {
                case 1:
                  System.out.println(" New Test           ");
                  System.out.println(" Test type          ");
                  System.out.println(" 1. Blood test      ");
                  System.out.println(" 2. ECG             ");
                  System.out.println(" 3. utrasonography  ");
                  System.out.print("Choose option: ");
                  option31 = input.nextInt();
                  switch (option31) {
                    case 1:
                      System.out.println("Date");
                      Scanner input19 = new Scanner(System.in);
                      System.out.print("Choose date: ");
                      date = input19.nextLine();
                      System.out.println("Appointmentint date: " + date);
                      System.out.println("Time");
                      System.out.println("1. 10.00am to 12.00am ");
                      System.out.println("2. 4.00pm to 6.00pm");
                      System.out.print("Choose time: ");
                      option32 = input19.nextInt();
                      switch (option32) {
                        case 1:
                          System.out.println(
                            "\tYour Appointment has been done"
                          );
                          System.out.println("\tAppointmentint date: " + date);
                          System.out.println(
                            "\tAppointmentint date:  10.00am to 12.00am "
                          );
                          break;
                        case 2:
                          System.out.println(
                            "\tYour Appointment has been done"
                          );
                          System.out.println("\tAppointmentint date: " + date);
                          System.out.println(
                            "\tAppointmentint date:  4.00am to 6.00am "
                          );
                          break;
                      }
                    case 2:
                      System.out.println("Date");
                      Scanner input20 = new Scanner(System.in);
                      System.out.print("Choose date: ");
                      date = input20.nextLine();
                      System.out.println("Appointmentint date: " + date);
                      System.out.println("Time");
                      System.out.println("1. 10.00am to 12.00am ");
                      System.out.println("2. 4.00pm to 6.00pm");
                      System.out.print("Choose time: ");
                      option33 = input20.nextInt();
                      switch (option33) {
                        case 1:
                          System.out.println(
                            "\tYour Appointment has been done"
                          );
                          System.out.println("\tAppointmentint date: " + date);
                          System.out.println(
                            "\tAppointmentint date:  10.00am to 12.00am "
                          );
                          break;
                        case 2:
                          System.out.println(
                            "\tYour Appointment has been done"
                          );
                          System.out.println("\tAppointmentint date: " + date);
                          System.out.println(
                            "\tAppointmentint date:  4.00am to 6.00am "
                          );
                          break;
                      }
                      break;
                    case 3:
                      System.out.println("Date");
                      Scanner input21 = new Scanner(System.in);
                      System.out.print("Choose date: ");
                      date = input21.nextLine();
                      System.out.println("Appointmentint date: " + date);
                      System.out.println("Time");
                      System.out.println("1. 10.00am to 12.00am ");
                      System.out.println("2. 4.00pm to 6.00pm");
                      System.out.print("Choose time: ");
                      option34 = input21.nextInt();
                      switch (option34) {
                        case 1:
                          System.out.println(
                            "\tYour Appointment has been done"
                          );
                          System.out.println("\tAppointmentint date: " + date);
                          System.out.println(
                            "\tAppointmentint date:  10.00am to 12.00am "
                          );
                          break;
                        case 2:
                          System.out.println(
                            "\tYour Appointment has been done"
                          );
                          System.out.println("\tAppointmentint date: " + date);
                          System.out.println(
                            "\tAppointmentint date:  4.00am to 6.00am "
                          );
                          break;
                      }
                  }
                  break;
                case 2:
                  System.out.println(" Test report ");
                  break;
              }
              break;
          }
          break;
        case 2:
          System.out.println("\n -->>Your selected Brance is Chattogram\n");
          obj.Menu();
          System.out.print("Choose Option: ");
          option16 = input.nextInt();
          switch (option16) {
            case 1:
              obj.Section();
              obj.Catagory();
              System.out.print("Choose Option: ");
              option17 = input.nextInt();
              switch (option17) {
                case 1:
                  obj.Cardiology();
                  System.out.print("Choose Option: ");
                  option18 = input.nextInt();
                  switch (option18) {
                    case 1:
                      System.out.println("Dr. Jitu ");
                      obj.date();
                      obj.time();
                      System.out.print("Choose time: ");
                      option19 = input.nextInt();
                      switch (option19) {
                        case 1:
                          obj.recipt1();
                          break;
                        case 2:
                          obj.recipt2();
                          break;
                      }
                      break;
                    case 2:
                      System.out.println("Dr. Saif ");
                      obj.date();
                      obj.time();
                      System.out.print("Choose time: ");
                      option20 = input.nextInt();
                      switch (option20) {
                        case 1:
                          obj.recipt1();
                          break;
                        case 2:
                          obj.recipt2();
                          break;
                      }
                      break;
                    case 3:
                      System.out.println("Dr. Nafim ");
                      obj.date();
                      obj.time();
                      System.out.print("Choose time: ");
                      option21 = input.nextInt();
                      switch (option21) {
                        case 1:
                          obj.recipt1();
                          break;
                        case 2:
                          obj.recipt1();
                          break;
                      }
                      break;
                  }
                  break;
                case 2:
                  obj.Dental();
                  System.out.print("Choose Option: ");
                  option22 = input.nextInt();
                  switch (option22) {
                    case 1:
                      System.out.println("Dr. Hakim ");
                      obj.date();
                      obj.time();
                      System.out.print("Choose time: ");
                      option23 = input.nextInt();
                      switch (option23) {
                        case 1:
                          obj.recipt1();
                          break;
                        case 2:
                          obj.recipt1();
                          break;
                      }
                      break;
                    case 2:
                      System.out.println("Dr. Hasan ");
                      obj.date();
                      obj.time();
                      System.out.print("Choose time: ");
                      option24 = input.nextInt();
                      switch (option24) {
                        case 1:
                          obj.recipt1();
                          break;
                        case 2:
                          obj.recipt2();
                          break;
                      }
                      break;
                    case 3:
                      System.out.println("Dr. Ahmed ");
                      obj.date();
                      obj.time();
                      System.out.print("Choose time: ");
                      option25 = input.nextInt();
                      switch (option25) {
                        case 1:
                          obj.recipt1();
                          break;
                        case 2:
                          obj.recipt2();
                          break;
                      }
                      break;
                  }
                  break;
                case 3:
                  obj.Diabetic();
                  System.out.print("Choose Option: ");
                  option26 = input.nextInt();
                  switch (option26) {
                    case 1:
                      System.out.println("Dr. Saimon ");
                      obj.date();
                      obj.time();
                      System.out.print("Choose time: ");
                      option27 = input.nextInt();
                      switch (option27) {
                        case 1:
                          obj.recipt1();
                          break;
                        case 2:
                          obj.recipt2();
                          break;
                      }
                      break;
                    case 2:
                      System.out.println("Dr. Nazmul Islam ");
                      obj.date();
                      obj.time();
                      System.out.print("Choose time: ");
                      option28 = input.nextInt();
                      switch (option28) {
                        case 1:
                          obj.recipt1();
                          break;
                        case 2:
                          obj.recipt2();
                          break;
                      }
                      break;
                    case 3:
                      System.out.println("Dr. Chowdhury ");
                      obj.date();
                      obj.time();
                      System.out.print("Choose time: ");
                      option29 = input.nextInt();
                      switch (option29) {
                        case 1:
                          obj.recipt1();
                          break;
                        case 2:
                          obj.recipt2();
                          break;
                      }
                      break;
                  }
                  break;
              }
              break;
            case 2:
              System.out.println("Test");
              System.out.println(".........Menu...........");
              System.out.println(" 1. New Test    ");
              System.out.println(" 2. Test report ");
              System.out.print("Choose Option: ");
              option35 = input.nextInt();
              switch (option35) {
                case 1:
                  System.out.println(" New Test           ");
                  System.out.println(" Test type          ");
                  System.out.println(" 1. Blood test      ");
                  System.out.println(" 2. ECG             ");
                  System.out.println(" 3. utrasonography  ");
                  System.out.print("Choose option: ");
                  option36 = input.nextInt();
                  switch (option36) {
                    case 1:
                      System.out.println("Date");
                      Scanner input22 = new Scanner(System.in);
                      System.out.print("Choose date: ");
                      date = input22.nextLine();
                      System.out.println("Appointmentint date: " + date);
                      System.out.println("Time");
                      System.out.println("1. 10.00am to 12.00am ");
                      System.out.println("2. 4.00pm to 6.00pm");
                      System.out.print("Choose time: ");
                      option37 = input22.nextInt();
                      switch (option37) {
                        case 1:
                          System.out.println(
                            "\tYour Appointment has been done"
                          );
                          System.out.println("\tAppointmentint date: " + date);
                          System.out.println(
                            "\tAppointmentint date:  10.00am to 12.00am "
                          );
                          break;
                        case 2:
                          System.out.println(
                            "\tYour Appointment has been done"
                          );
                          System.out.println("\tAppointmentint date: " + date);
                          System.out.println(
                            "\tAppointmentint date:  4.00am to 6.00am "
                          );
                          break;
                      }
                      break;
                    case 2:
                      System.out.println("Date");
                      Scanner input23 = new Scanner(System.in);
                      System.out.print("Choose date: ");
                      date = input23.nextLine();
                      System.out.println("Appointmentint date: " + date);
                      System.out.println("Time");
                      System.out.println("1. 10.00am to 12.00am ");
                      System.out.println("2. 4.00pm to 6.00pm");
                      System.out.print("Choose time: ");
                      option38 = input23.nextInt();
                      switch (option38) {
                        case 1:
                          System.out.println(
                            "\tYour Appointment has been done"
                          );
                          System.out.println("\tAppointmentint date: " + date);
                          System.out.println(
                            "\tAppointmentint date:  10.00am to 12.00am "
                          );
                          break;
                        case 2:
                          System.out.println(
                            "\tYour Appointment has been done"
                          );
                          System.out.println("\tAppointmentint date: " + date);
                          System.out.println(
                            "\tAppointmentint date:  4.00am to 6.00am "
                          );
                          break;
                      }
                      break;
                    case 3:
                      System.out.println("Date");
                      Scanner input24 = new Scanner(System.in);
                      System.out.print("Choose date: ");
                      date = input24.nextLine();
                      System.out.println("Appointmentint date: " + date);
                      System.out.println("Time");
                      System.out.println("1. 10.00am to 12.00am ");
                      System.out.println("2. 4.00pm to 6.00pm");
                      System.out.print("Choose time: ");
                      option39 = input24.nextInt();
                      switch (option39) {
                        case 1:
                          System.out.println(
                            "\tYour Appointment has been done"
                          );
                          System.out.println("\tAppointmentint date: " + date);
                          System.out.println(
                            "\tAppointmentint date:  10.00am to 12.00am "
                          );
                          break;
                        case 2:
                          System.out.println(
                            "\tYour Appointment has been done"
                          );
                          System.out.println("\tAppointmentint date: " + date);
                          System.out.println(
                            "\tAppointmentint date:  4.00am to 6.00am "
                          );
                          break;
                      }
                      break;
                  }
                  break;
                case 2:
                  System.out.println(" Test report ");
                  break;
              }
              break;
          }
          break;
      }
      System.out.println(" Option 1. continue");
      System.out.println(" Option 2. exit");
      System.out.print(" Choose option: ");
      a = input.nextInt();
      if (a == 2) ok = false;
    } while (ok);
    System.out.print("Thank you");
  }
}
