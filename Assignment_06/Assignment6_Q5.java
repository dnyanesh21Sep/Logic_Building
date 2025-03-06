//Write a program which accept number from user and display its table in reverse order

import java.util.Scanner;

class Assignment6_Q5{


    public static void Tablex(int iNo){


    for(int i=10;i>=1;i--){

        System.out.println(iNo*i);
    }
}

public static void main(String[] args) {
    int iValue=0;
    

    Scanner sobj = new Scanner(System.in);

    System.out.print("Enter a  number: ");
    iValue = sobj.nextInt();

    Tablex(iValue); // Call the function

    sobj.close(); // Close Scanner
}
}