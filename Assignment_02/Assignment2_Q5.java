/*
    iRow = 4
    iCol = 4

    #   
    #   #         
    #   #   #   
    #   #   #   #    
*/

import java.util.Scanner;

class Assignment2_Q5{

    public static void Print(int iRow,int iCol){

        for(int i=0;i<iRow;i++){

            for(int j=0;j<=i;j++){

                System.out.print(" # ");
            }

            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        
        int iValue1=0,iValue2=0;
        
        Scanner sobj=new Scanner(System.in);


        System.out.println("Enter the Number of Rows  : ");

        iValue1=sobj.nextInt();

        System.out.println("Enter the Number of Column : ");

        iValue1=sobj.nextInt();

        Print(iValue1,iValue2);
    }
       
}