import java.util.Scanner;
public class Even_Odd{
    public static void main(String[] args) {
        Integer number;
        Scanner evenOddScanner = new Scanner(System.in);
        System.out.println("Enter a  Number(Integer):");
        number = evenOddScanner.nextInt();
        if(number%2==0){
            System.out.println(number+" is an even number.");
        }
        else{
            System.out.println(number+" is an odd number.");
            evenOddScanner.close();

        }
        }
    }