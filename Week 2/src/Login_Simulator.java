import java.util.Scanner;
public class Login_Simulator {
    public static void main(String[] args) {
        String username;
        String password;
        Scanner inputDetailsScanner = new Scanner(System.in);
        System.out.println("Please Enter Your Name :");
        username = inputDetailsScanner.nextLine();
        System.out.println("Please Enter Password :");
        password = inputDetailsScanner.nextLine();
        inputDetailsScanner.close();
        if(username.equals("admin") && password.equals("admin123")){
            System.out.println("Login Successful!!");
        }
        else{
            System.out.println("Invalid Credentials.Please Try Again.");
        }

    }
    
}
