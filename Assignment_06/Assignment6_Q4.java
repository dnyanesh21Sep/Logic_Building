

import java.util.*;

class Assignment6_Q4{
public static void Tablex(int iNo){


    for(int i=1;i<=10;i++){

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
