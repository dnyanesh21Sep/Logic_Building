
import java.util.Scanner;

//Accept amount in US dollar and rerurn its corresponding value in Indian currency. Consider 1$ as 70 rupees
class Assignment7_Q1{


    public static int CurrencyConverter(int iNo){
       int Ans=0;

       Ans=iNo *70;
       return Ans;
    }

    public static void main(String[] args){

     int iValue=0,iRet=0;

     System.out.println("Enter the Value in dollar : ");
     Scanner sobj=new Scanner(System.in);
     iValue=sobj.nextInt();

     iRet=CurrencyConverter(iValue);
     System.out.println("The Amount in indian Rupees is "+iRet);   
    }
}