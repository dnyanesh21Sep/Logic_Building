
import java.util.Scanner;

//Write a program which accept N and print first 5 multiples of N

class  Assignment5_Q4{
    
    public static void  DisplayMultple(int iNo){
          
 
          for(int i=1;i<=5;i++){
               
               System.out.println(" "+iNo *i);

          }

        }
    public static void main(String[] args) {

        int iValue=0,iRet=0;

        Scanner sobj =new Scanner(System.in);

        System.out.println("Enter the Number : ");

        iValue=sobj.nextInt();

        DisplayMultple(iValue);

    } 
    }


