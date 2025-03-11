// Write a program which accept radius of circle from user and calculate its area. Consider value of PI as 3.14(Area = PI * Radius * Radius)

import java.util.Scanner;

class Assignment8_Q1{

    public static double Area(int iNo){
        
        double Area;
        Area=(3.14*iNo*iNo);
        return Area;

    }
    public static void main(String[] args) {
        
     int iValue=0;
     double iRet;
    
     System.out.println("Enter the Radius  : ");
    
     Scanner sobj=new Scanner(System.in);
    
     iValue=sobj.nextInt();

     iRet=Area(iValue);

     System.out.println("Area of A circle is "+iRet);

    }

}