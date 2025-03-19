//  W a p accepts a string from the user and counts the number of small letters present in the string using recursion.

import java.util.Scanner;

class Assignment15_Q3 {

    public static int CountSmall(String str,int index,int iCount){

        if(index>str.length()-1){

            return iCount;
        }

        if(str.charAt(index)>='a' && str.charAt(index)<='z'){

            iCount++;

        } 

        return CountSmall(str, index +1,iCount);
    }
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in); 

        System.out.print("Enter a string: ");

        String str = sobj.nextLine();

        int iRet=CountSmall(str,0,0);

        System.out.println("Number of small letters in string is " +iRet);
        
        sobj.close(); 
}
}
