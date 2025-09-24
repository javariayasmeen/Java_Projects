import java.util.Scanner;
public class TrafficLight {
    public static void main(String[] args) {
        String TrafficLightColor;
        Scanner LightColorScanner = new Scanner(System.in);
        System.out.println("Enter Light Color :");
        TrafficLightColor=LightColorScanner.nextLine();
        LightColorScanner.close();
        if (TrafficLightColor.equals("red")) {
            System.out.println("Stop");  
        } else if (TrafficLightColor.equals("yellow")) {
            System.out.println("Slow Down");    
        } else if (TrafficLightColor.equals("green")) {
            System.out.println("Go");   
        }
    else{
        System.out.println("Invalid color.Please entered red,yellow, or green.");
    }
}
   
}
