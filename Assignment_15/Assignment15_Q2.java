//Write a program which  accepts an integer number from the user and determines the largest digit present in that number using recursion

import java.util.Scanner; // Import Scanner class

class Assignment15_Q2{

    public static int MaxDigit(int iValue,int iMax){
        
        int iDigit=0;

        if(iValue==0){

            return iMax;

        }
        iDigit=iValue%10;
        if(iDigit>iMax){

            iMax=iDigit;

        }
        iValue=iValue/10;
        return MaxDigit(iValue,iMax);
    }
    public static void main(String[] args) {
        int iRet=0;

        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int number = sobj.nextInt(); 

        iRet=MaxDigit(number,0);

        System.out.println("Maximum Digit in the Number "+number+" is "+iRet);




        sobj.close();
    }
}
