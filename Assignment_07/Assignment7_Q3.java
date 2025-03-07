
import java.util.Scanner;

//Write a program to find odd factorial of given number

class Assignment7_Q3{
public static int EvenFactorial(int iNo){

    int iFact=1,oddFact=1;


    if (iNo < 0){

      iNo = -iNo;

    }
    for(int i=iNo;i>=2;i--){

        if(i%2!=0){

            oddFact=oddFact*i;
        }
    }  
  return oddFact;
}

public static void main(String[] args) {
    
 int iValue=0,iRet=0;

 System.out.println("Enter the Value : ");

 Scanner sobj=new Scanner(System.in);

 iValue=sobj.nextInt();
 iRet=EvenFactorial(iValue);
 System.out.print("odd factorial of number is = "+iRet );
}
}