/*
 Example Output (corresponding to the input above):
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5

 */

import java.util.Scanner;

class Assignment12_Q1{


    public static void Print(int No){


        for(int iRow=0;iRow<No;iRow++){

            for(int iCol=0;iCol<iRow +1;iCol++){

                

                System.out.print(iCol +1+" ");
            }

            System.out.println();
        }
    }

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create Scanner object

        System.out.print("Enter a number: ");
        int number = sc.nextInt();  // Accept integer input

        Print(number);

        sc.close();  // Close the Scanner
 }
}