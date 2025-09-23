import java.util.Scanner;
public class Simple_Tip_Calculator{
    public static void main(String[] args) {
        // Simple Tip Calculator
        double billAmount;
        double tip;
        double totalAmount;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter the Bill Amount :");
        billAmount=scanner.nextDouble();
         tip=billAmount*0.15;   //15% tip is given
        totalAmount=billAmount+tip;
        System.out.println("Tip(15%) :"+tip+"Rs.");
        System.out.println("Total Amount :"+totalAmount+"Rs.");
        // Custom Tip Calculator
        double customTipPercent;
        double customTip;
        double customTotal;
        System.out.println("Please Enter Custom Tip Percent :");
        customTipPercent=scanner.nextDouble();
        scanner.close();
        customTip=billAmount*(customTipPercent/100);
        customTotal=billAmount+customTip;
        System.out.println("Tip ("+customTipPercent+"%):"+customTip+"Rs.");
        System.out.println("Total Amount :"+customTotal+"Rs.");
    }
}