
import java.util.Scanner;

// Write a program which accept one number from user and print even factors of that number
class Assignment3_Q2{


    public static void PrintEvenFactors(int iNo){

          int iDigit=0;
          
          System.out.println("Even Factors are : ");

          for(int i=1;i<=iNo/2;i++){

              if(iNo%i==0){
                 
                if(i%2==0){

                System.out.println(""+i);    

                }
              }
          }  
    }
    

    public static void main(String[] args) {

        int iValue=0;

        Scanner sobj =new Scanner(System.in);

        System.out.println("Enter the Number : ");

        iValue=sobj.nextInt();

        PrintEvenFactors(iValue);

    }      
}