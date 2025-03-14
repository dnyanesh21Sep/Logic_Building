/*
 Example Output (corresponding to the input above):
1
1 2
1   3
1     4
1 2 3 4 5

 */

 import java.util.Scanner;

 class Assignment12_Q2{
 
 
     public static void Print(int No){
 
 
         for(int iRow=0;iRow<No;iRow++){
 
             for(int iCol=0;iCol<=iRow;iCol++){
 
                 if(iCol==0 || iCol==iRow || iCol==No-1){
                 
                 System.out.print(iCol +1);

                 }
                 else{
                     
                    System.out.print(" ");

                 }
             }
 
             System.out.println();
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