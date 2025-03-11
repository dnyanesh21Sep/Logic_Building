
import java.util.Scanner;

//Write a program which accept distance in kilometre and convert it into meter(1 kilometre = 1000 meter)

class Assignment8_Q3{

    public static int KMtoMeter(int iNo) {

        if (iNo < 0) {
            iNo = -iNo;
        }
        return iNo * 1000; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter distance in kilometers: ");
        int iValue = scanner.nextInt();

       
        int iRet = KMtoMeter(iValue);

       
        System.out.println(iValue + " km distance in meters is: " + iRet);

        scanner.close();
        
    }
}
