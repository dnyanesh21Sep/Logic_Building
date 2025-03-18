//Write a recursive program which accept number from user and return its Sum of Digits Using Recursion

import java.util.Scanner;

class Assignment14_Q1{

    public static int SumDigit(int iNo){

        if(iNo==0){

            return  0;
        }
        int iDigit=iNo%10 *1;
        return iDigit + SumDigit(iNo / 10);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");

        // Read integer input
        int num = sc.nextInt();

        int iRet=SumDigit(num);

        System.out.println("Sum of digits is "+iRet);
    }
}