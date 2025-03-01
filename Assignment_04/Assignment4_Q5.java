
import java.util.Scanner;

//Write a program which accept number from user and return difference between summation of all its factors and non factors

class Assignment4_Q5{

    public static int  NonFactSum(int iNo){
                 
       int i=0,iSumFact=0,iSumNonFact=0;
    
        for (i=1;i<=iNo;i++)
        {
            if (iNo % i== 0)
            {
              iSumFact=iSumFact + i;

            }
            else if(iNo % i!= 0){

                iSumNonFact=iSumNonFact +i;

            }

        }

        return (iSumFact - iSumNonFact);

    }

    public static void main(String[] args) {
    
        int iValue=0,iRet=0;
    
        Scanner sobj =new Scanner(System.in);
    
        System.out.println("Enter the Number : ");
    
        iValue=sobj.nextInt();
    
        iRet=NonFactSum(iValue); 

        System.out.println("Difference between Summation Of All its factors and non factors of Number "+ iValue+ " is "+iRet);

      }
}
    