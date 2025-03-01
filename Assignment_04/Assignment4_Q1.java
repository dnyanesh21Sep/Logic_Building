//Write a program which accept number from user and display its multiplication of factors

import java.util.Scanner;

class Assignment4_Q1{

    
    public static int FactorsMul(int iNo){
             
        int Ans=0;
        int iMul=1;
        for(int i=1;i<=iNo;i++){

            if(iNo%i==0){
               
              iMul=iMul*i;
    
            }
        }
          
        return iMul;
    }
    

    public static void main(String[] args) {

        int iValue=0,iRet=0;

        Scanner sobj =new Scanner(System.in);

        System.out.println("Enter the Number : ");

        iValue=sobj.nextInt();

        iRet=FactorsMul(iValue);

        System.out.println("Fctors Multiplication is " +iRet);
    }

}