//Write a program which accept number from user and if number is less than 50 then print small, if it is greater than 50 and less than 100 then print medium, if it is greater than 100 then large

import java.util.Scanner;

class Assignment6_Q1{

    public static void Number(int iNo){
         
        if(iNo<=50){

            System.out.println("Small\n");
        }
        else if(50> iNo&& iNo<=100){

            System.out.println("Medium");
        }
        else{

            System.out.println("Larger");
        }

    }

    public static void main(String[] args) {

        int iValue=0;

        
        System.out.println("Enter the Number : ");
        Scanner sobj=new Scanner(System.in);

        iValue=sobj.nextInt();

        Number(iValue);



    }
}