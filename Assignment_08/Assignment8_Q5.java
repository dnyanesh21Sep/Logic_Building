import java.util.Scanner;

class Assignment8_Q5{

     public static double SquareMeter(int iValue) {

        return 0.0929 * iValue; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter area in square feet: ");
        int iValue = scanner.nextInt();

        double dRet = SquareMeter(iValue);

        System.out.printf("%d square feet is equal to %.2f square meters.%n", iValue, dRet);

        scanner.close();
    }
}