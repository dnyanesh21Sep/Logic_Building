
import java.util.Scanner;

//Write a program which accept number from user and return summation of all its non factors
class Assignment4_Q4{

    public static int  NonFactSum(int iNo){
                 
       int i=0,iSum=0;
    
        for (i=1;i<=iNo;i++)
        {
            if (iNo % i != 0)
            {
              iSum=iSum + i;

            }
        }

        return iSum;

    }
    
    
    public static void main(String[] args) {
    
        int iValue=0,iRet=0;
    
        Scanner sobj =new Scanner(System.in);
    
        System.out.println("Enter the Number : ");
    
        iValue=sobj.nextInt();
    
        iRet=NonFactSum(iValue); 

        System.out.println("Sum of Non factors of Number "+ iValue+ " is "+iRet);

      }
}
    