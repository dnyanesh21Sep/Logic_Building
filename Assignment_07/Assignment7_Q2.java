//Write a program to find even factorial of given number

import java.util.Scanner;

class Assignment7_Q2{


    public static int EvenFactorial(int iNo){

        int iFact=1,evenFact=1;


        if (iNo < 0){
    
          iNo = -iNo;

        }
        for(int i=iNo;i>=2;i--){

            if(i%2==0){

                evenFact=evenFact*i;
            }
        }  
      return evenFact;
    }

    public static void main(String[] args) {
        
     int iValue=0,iRet=0;

     System.out.println("Enter the Value : ");

     Scanner sobj=new Scanner(System.in);

     iValue=sobj.nextInt();
     iRet=EvenFactorial(iValue);
     System.out.print("Even factorial of number is"+iRet );


    }
}