import java.util.Scanner ;
public class Age_Calculator{
    public static void main(String[] args) {
        Integer birthYear;
        Integer currentYear;
        Integer age;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Your Birth Year :");
        birthYear=scanner.nextInt();
        System.out.println("Please Enter Current Year :");
        currentYear=scanner.nextInt();
        age=currentYear-birthYear;
        System.out.println("You are approximately "+age+"years old.");
        scanner.close();
    }
}