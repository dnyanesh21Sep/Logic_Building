//Write a program which accept number from user and print that number of $ & * on screen

import java.util.Scanner;

class Assignment5_Q1{

    
    public static void  Print(int iNo){
             
          for(int i=0;i<iNo;i++){
             
               System.out.print("$ & * ");
               System.out.println(" ");
          }

        }
    

    public static void main(String[] args) {

        int iValue=0,iRet=0;

        Scanner sobj =new Scanner(System.in);

        System.out.println("Enter the Number To print  : ");

        iValue=sobj.nextInt();

        Print(iValue);

    } 
    }

