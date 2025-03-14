//Write a program which accept a string from user and copy the contents of that string into another string.(Implement strcpy() function

import java.util.Scanner;

class Assignment11_Q1{
        
    public static String strcpy(String str){

       StringBuilder gtr=new StringBuilder();

       for(int i=0;i<str.length();i++){
         
          gtr.append(str.charAt(i));

       }

       return gtr.toString();

    }
    public static void main(String[] args) {
        
        String str;
        String SRet;
        // char ch;
        int iRet=0;

        System.out.println("Enter the String : ");

        Scanner sobj=new Scanner(System.in);
        
        str=sobj.nextLine();

        SRet=strcpy(str);
        System.out.println("Copied string is "+SRet);
    
        sobj.close();
    }
}