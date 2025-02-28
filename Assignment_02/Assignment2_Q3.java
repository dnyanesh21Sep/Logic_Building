
import static java.lang.System.in;
import java.util.Scanner;

//Accept two numbers from user and display first number in second number of times

class Assignment2_Q3{

    public static void  Print(int No1,int No2){
        
        for(int i=0;i<No2;i++){

            System.out.println(" "+No1);
        }
    }

    public static void main(String[] args) {
        
        int iValue1=0;
        int iValue2=0,iRet=0;

        Scanner sobj=new Scanner(in);

        System.out.println("Enter the Number first : ");
        iValue1=sobj.nextInt();

        System.out.println("Enter the Number Second : ");
        iValue2=sobj.nextInt();

        Print(iValue1,iValue2);
    }
}