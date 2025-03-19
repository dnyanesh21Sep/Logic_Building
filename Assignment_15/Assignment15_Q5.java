// Write a program which accept number  from user and return its reverse number using Recursion 

import java.util.Scanner; // Import Scanner class

class Assignment15_Q5{

    public static void  Reverse(int iNo,int Reverse){

        if(iNo==0){

            return;

        }
        int iDigit=iNo%10;
        Reverse=iDigit;
        System.out.print(""+Reverse);
        Reverse(iNo/10,Reverse);
       
    }
    public static void main(String[] args) {

        Scanner sobj = new Scanner(System.in); 

        System.out.print("Enter a number: ");

        int number = sobj.nextInt(); 

        Reverse(number,0);

        // System.out.println("Reverse Number is "+iRet);

        sobj.close(); 
    }
}
