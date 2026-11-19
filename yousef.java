import java.util.Scanner;
 public class Yousef {
    public static void main (String[] args){

      Scanner scan = new Scanner (System.in);
        System.out.println("please enter your visa card ");
scan.nextLine();


        int j = 1;
        int password ;
        boolean login = false;


        while (j <= 3 && login == false) {

            System.out.println("Please enter your password");
            password = scan.nextInt();

            if (password == 1234) {
                login = true;
            }

            j++;
        }



        if (login == true) {
            System.out.println("Login Successful");

            int choice = scan.nextInt();
            switch (choice) {

                case 1:
                    System.out.println("check balance");
                    break;
                case 2:
                    System.out.println("Deposit");
                    break;
                case 3:
                    System.out.println("Withdraw");
                    break;
                case 4:
                    System.out.println("Show Account Status");
                    break;
                default:
                    System.out.println("Exit");


            }
        }
        else
        {
            System.out.println("Your account has been locked.");
        }

        
}
}
