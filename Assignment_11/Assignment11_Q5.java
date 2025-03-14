//Write a program in which accept string  check whether the string is Palindrome or not 


import java.util.Scanner;

class Assignment11_Q5{
        
    public static String CheckPalindrome(String str){

       StringBuilder sstr=new StringBuilder();

       for(int i=str.length()-1;i>=0;i--){

         sstr.append(str.charAt(i));

       }
      
       return sstr.toString();

    }
    public static void main(String[] args) {
        
        String str1 = null;
        String SRet;
        // char ch;
        int iRet=0;

        System.out.println("Enter the  String : ");

        Scanner sobj=new Scanner(System.in);

        str1=sobj.nextLine();

        SRet=CheckPalindrome(str1);
        
        if(SRet.equals(str1)){

            System.out.println("The String is Palindrome : ");

        }
        else{

            System.out.println("The String is not  Palindrome : ");

        }
        
        sobj.close();
    }
}