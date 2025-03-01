
import java.util.Scanner;

//Write a program which accept number from user and display its factors in decreasing order

class Assignment4_Q2{

public static void  FactorsRev(int iNo){
             
   int i=0;

    for (i = iNo-1; i >= 1; i--)
    {
        if (iNo % i == 0)
        {
           System.out.println(i);
        }
    }
}


public static void main(String[] args) {

    int iValue=0,iRet=0;

    Scanner sobj =new Scanner(System.in);

    System.out.println("Enter the Number : ");

    iValue=sobj.nextInt();

    FactorsRev(iValue);

 
}
}
