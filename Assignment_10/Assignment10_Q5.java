
import java.util.Scanner;

//Write a program which accepts a string from user reverse that string in place.


class Assignment10_Q5{
    

    public static String revString(String str){

        String reverse=" ";
        char ch;

        for(int i=0;i<str.length();i++){

            ch=str.charAt(i);
            reverse=ch +reverse;
        }

        return reverse;

    }

    
    public static void main(String[] args) {
        
        String str;
        String SRet;
        char ch;
        int iRet=0;

        System.out.println("Enter the String : ");

        Scanner sobj=new Scanner(System.in);
        
        str=sobj.nextLine();

        SRet=revString(str);
        System.out.println("Reverse string is "+SRet);
    
        sobj.close();
    }
}