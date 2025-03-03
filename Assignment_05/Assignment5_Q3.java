
import java.util.Scanner;

//Write a program which accepts N from user and print all odd numbers up to N


class  Assignment5_Q3{
    
    public static void  Display(int iNo){
          

        System.out.println("Even Numbers are : ");
          for(int i=1;i<=iNo;i++){
             
            if(i%2==0){

               System.out.print(" "+i);

            }
               System.out.println(" ");
          }

        }
    

    public static void main(String[] args) {

        int iValue=0,iRet=0;

        Scanner sobj =new Scanner(System.in);

        System.out.println("Enter the Number : ");

        iValue=sobj.nextInt();

        Display(iValue);

    } 
    }


