
import java.util.Scanner;

//Program to divide two numbers

class Assignment1_Q1{

    public static int DivideNum(int No1,int No2){
       int Result=0;

       Result=No1/No2;

       return Result;
    }

    public static void main(String[] args) {
        
        int iValue1=0;
        int iValue2=0,iRet=0;

        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the Number one : ");
        iValue1=sobj.nextInt();

        System.out.println("Enter the Number Two : ");
        iValue2=sobj.nextInt();

        iRet=DivideNum(iValue1,iValue2);

        System.out.println("The division iValue1/iValue2 = "+iRet);
    }
}