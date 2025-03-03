//Write a program which accept number from user and print numbers till that number

import java.util.Scanner;

class  Assignment5_Q2{


    
    public static void  PrintNum(int iNo){
             
          for(int i=1;i<=iNo;i++){
             
               System.out.print(" "+i);
               System.out.println(" ");
          }

        }
    

    public static void main(String[] args) {

        int iValue=0,iRet=0;

        Scanner sobj =new Scanner(System.in);

        System.out.println("Enter the Number : ");

        iValue=sobj.nextInt();

        PrintNum(iValue);

    } 
    }