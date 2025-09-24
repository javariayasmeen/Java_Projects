import java.util.Scanner;
public class LeapYearChecker {
    public static void main(String[] args) {
        Integer year;
        Scanner LeapYearScanner = new Scanner(System.in);
        System.out.println("Enter a Year :");
        year=LeapYearScanner.nextInt();
        LeapYearScanner.close();
        if ((year%4==0&&year%100!=0)||(year%400==0)) {
            System.out.println(year+" is a Leap Year.");   
        } else {
            System.out.println(year+" is not a Leap Year.");
        }
    }
}
