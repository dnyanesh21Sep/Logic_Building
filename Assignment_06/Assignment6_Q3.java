//Write a program to find factorial of given number

import java.util.Scanner;

class Assignment6_Q3 {

    public static long Factorial(int iNo){

        long iFact=1;

        
         if (iNo < 0)
        {
        iNo = -iNo;
       }

        for(int i=iNo;i>=1;i--){

            iFact=iFact *i;

        }
       return iFact;
    }

    public static void main(String[] args) {
        int iValue=0;
        long iRet=0;
        

        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter a single-digit number: ");
        iValue = sobj.nextInt();

        iRet=Factorial(iValue); // Call the function

        System.out.println("Factorial of given number is "+iRet);

        sobj.close(); // Close Scanner
    }
}
