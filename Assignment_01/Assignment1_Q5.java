
import java.util.Scanner;

//Accept one number from user and print that number of * on screen.


class Assignment1_Q5{

    public static void Print(int No1){
      int i=0;

      while(i<No1){
          
       System.out.println("*");
       i++;

      }
    }

    public static void main(String[] args) {
        int No=0;
        System.out.println("Enter The Number that You want : ");
        Scanner sobj=new Scanner(System.in);

        No=sobj.nextInt();

        Print(No);

    }
}