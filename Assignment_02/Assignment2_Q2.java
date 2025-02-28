//Accept one number from user if number is less than 10 then print "Hello" otherwise print"Demo"

import java.util.Scanner;

class Assignment2_Q2{

    public static void Print(int No){

        if(No<10){

           System.out.println("Hello");
        }
        else{

            System.out.println("Demo");
        }
    }
    public static void main(String[] args) {
        
        int iValue1=0;
        
        Scanner sobj=new Scanner(System.in);


        System.out.println("Enter the Number : ");

        iValue1=sobj.nextInt();

        Print(iValue1);

    }
       
}