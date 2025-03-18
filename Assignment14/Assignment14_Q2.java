//Write a recursive program which accept number from user and return its Count the Number of Digits Using Recursion

import java.util.Scanner;

class Assignment14_Q2{

    public static int CountDigit(int iNo){

        int iCount=0;

        if(iNo==0){

            return iCount;
        }
        iCount++;
        CountDigit(iNo/10);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");

        // Read integer input
        int num = sc.nextInt();

        int iRet=CountDigit(num);

        System.out.println("Total Count of digits is "+iRet);
    }
}