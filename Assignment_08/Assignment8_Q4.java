
import java.util.Scanner;

class Assignment8_Q4{
        
    public static double FhtoCs(double fTemp) {

        return (fTemp - 32) * (5.0 / 9.0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter temperature in Fahrenheit: ");
        double fValue = scanner.nextDouble();

   
        double dRet = FhtoCs(fValue);

       
        System.out.printf("%.2f°F in Celsius is: %.2f°C%n", fValue, dRet);

        scanner.close();
    
        
    }
}
