/*
Print below Pattern 
Example Output (corresponding to the input above):
1 2 3 4 5
2 3 4 5
3 4 5  
4 5
5
*/
import java.util.Scanner;

class Assignment12_Q3{


    public static void Print(int No){

        for(int iRow=0;iRow<No;iRow++){

            for(int iCol=iRow+1;iCol<=No;iCol++){

                System.out.print(iCol+ " ");
            }
            System.out.println(" ");

        }
    }

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  

        System.out.print("Enter a number: ");
        int number = sc.nextInt();  

        Print(number);

        sc.close();  
 }
}
