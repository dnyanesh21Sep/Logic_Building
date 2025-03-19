// Write a program which accept Number  from user and returns smallest digit using recursion

import java.util.Scanner;
class Assignmt15_Q4{

    public static int SmallDigit(int iValue,int iMin){

        if(iValue==0){

            return iMin;

        }
        int iDigit=iValue%10;
        if(iDigit<iMin){

            iMin=iDigit;

        }
       
        return SmallDigit(iValue/10,iMin);
    }
    public static void main(String[] args) {
        int iRet=0;

        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int number = sobj.nextInt(); 

        iRet=SmallDigit(number,number %10 );

        System.out.println("Small Digit in the Number "+number+" is "+iRet);

        sobj.close();
    }
}

