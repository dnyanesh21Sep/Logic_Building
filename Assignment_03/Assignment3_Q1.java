
import java.util.Scanner;

//Write a program which accept one number from user and print that number of even numbers on screen

class Assignment3_Q1{


    public static void PrintEvenDigit(int iNo){

        int iDigit=0;
        System.out.println("Even Digits are : ");
        while(iNo !=0){

          iDigit=iNo%10;
          if(iDigit%2==0){

              System.out.println(iDigit);
          }
         iNo=iNo/10;    
        }
    }

    public static void main(String[] args) {

        int iValue=0;

        Scanner sobj =new Scanner(System.in);

        System.out.println("Enter the Number : ");

        iValue=sobj.nextInt();

        PrintEvenDigit(iValue);
       
    }
}