
import java.util.Scanner;

//Write a program which accept number from user and display all its non factors


class Assignment4_Q3{

    public static void  NonFactors(int iNo){
                 
       int i=0;
       System.out.println("Non  factors of Number "+iNo+"are : ");
        for (i=1;i<=iNo;i++)
        {
            if (iNo % i != 0)
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
    
        NonFactors(iValue); 

      }
}
    