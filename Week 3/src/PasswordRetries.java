import java.util.Scanner;
public class PasswordRetries {

    public static void main(String[] args) {
        String correctPassword = "Alpha123";
        Integer maxAttempts=3;
        String userPassword;
        Scanner correctPasswordScanner = new Scanner(System.in);
        while (maxAttempts>0) {
            System.out.println("Enter Password:");
            userPassword = correctPasswordScanner.nextLine();
            if (userPassword.equals(correctPassword)) {
                System.out.println("Login Successful!!");
                break;
              }
              else {
                maxAttempts--;
                if(maxAttempts>0){
                System.out.println("Incorrect Password.You have"+ maxAttempts+ "attempts left.");
            }
              
             else {
                System.out.println("Account Locked.Please Contact Support!!");
              }
             }
            }
             correctPasswordScanner.close();
             }
}