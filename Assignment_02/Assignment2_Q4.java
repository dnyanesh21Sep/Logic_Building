//Accept number from user and check whether number is even or add

import java.util.Scanner;

class Assignment2_Q4{

    public static boolean  EvenOdd(int No){

        boolean bFlag=false;

        if(No%2==0){

           bFlag=true;

        }
        return bFlag;
    }
    public static void main(String[] args) {
        
        int iValue1=0;
        boolean bFlag=false;
        
        Scanner sobj=new Scanner(System.in);


        System.out.println("Enter the Number : ");

        iValue1=sobj.nextInt();

        bFlag=EvenOdd(iValue1);

        if(bFlag==true){

            System.out.println("Given Number is Even");
        }
        else{

            System.out.println("Given Number is not Odd");
        }

    }
       
}