import java.util.Scanner;
public class SimpleMenu {
    public static void main(String[] args) {
        Integer num;
        Scanner bankAccountScanner = new Scanner(System.in);
        System.out.println("Welcome to your Bank Account :");
        System.out.println("Please Select one of the following options :");
        System.out.println("1: View Balance ");
        System.out.println("2: Deposit");
        System.out.println("3: Withdraw");
        System.out.println("4: Exit ");
        System.out.println("Please Enter your Choice :");
        num=bankAccountScanner.nextInt();
        bankAccountScanner.close();
        switch(num) {
            case 1:
            System.out.println("Viewing Balance....");
            break;
            case 2:
            System.out.println("Proceedig Deposit....");
            break; 
            case 3:
            System.out.println("Initiating Withdrawal....");   
            break;
            case 4:
            System.out.println("Existing.Thank You!!!... ");
            break;
            default:
            System.out.println("Invalid choice. Please Try Again");
        }    
    }
    
}
