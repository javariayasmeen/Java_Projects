import java.util.Scanner;
public class Project {
    public static void main(String[] args) {
        // Simple Calculator 
        double num1,num2,result;
        String operator;
        Scanner calculatorScanner = new Scanner(System.in);
        System.out.println("Enter First Number :");
        num1=calculatorScanner.nextDouble();
        System.out.println("Enter Second Number :");
        num2=calculatorScanner.nextDouble();
        System.out.println("Enter  one of the following operations  you want to perform(+,-,*,/):");
         operator=calculatorScanner.next();
        calculatorScanner.close();
        switch (operator) {
            case "+":
            result=num1+num2;
            System.out.println("Result:" +result);
            
            break;
            case "-":
            result=num1-num2;
            System.out.println("Result:" +result);
            
            break;
            case "*":
            result=num1*num2;
            System.out.println("Result:" +result);
            break;
            case "/":
            if(num2!=0){
                result=num1/num2;
                System.out.println("Result:" +result);
            }
            else{
                System.out.println("Invalid:Division by zero can't be possible.");
            }   
            break;
            default:
            System.out.println("Invalid Choice.Please Enter Valid Option!!");
        }

    }
    
}
