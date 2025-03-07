
import java.util.Scanner;

//Write a program which returns difference between Even Factorial and Odd Factorial of given number


class Assignment7_Q4{
    public static int diffEvenodd(int iNo){
    
        int iFact=1,oddFact=1,EveniFact=1;
    
    
        if (iNo < 0){
    
          iNo = -iNo;
    
        }
        for(int i=iNo;i>=2;i--){
    
            if(i%2!=0){
    
                oddFact=oddFact*i;
            }
            else if(i%2==0){

               EveniFact=EveniFact *i;

            }
        }  
      return (EveniFact-oddFact);

    }
    
    public static void main(String[] args) {
        
     int iValue=0,iRet=0;
    
     System.out.println("Enter the Value : ");
    
     Scanner sobj=new Scanner(System.in);
    
     iValue=sobj.nextInt();
     iRet=diffEvenodd(iValue);
     System.out.print("Diffrence between even and odd factorial of number is = "+iRet );
    }
    }