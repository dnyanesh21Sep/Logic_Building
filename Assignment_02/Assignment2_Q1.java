// Accept one number from user and print that number of * on screen.


import java.util.Scanner;

class Assignment2_Q1{

    public static void Print(int No){

        for(int i=0;i<No;i++){

            System.out.println(" * ");
        }
    }
    public static void main(String[] args) {
        
        int iValue1=0;
        
        Scanner sobj=new Scanner(System.in);


        System.out.println("Enter the Value: ");

        iValue1=sobj.nextInt();

        Print(iValue1);
        }
       
    }