
// Write a program which accepts string from user and copy small characters of that string into another string
import java.util.Scanner;

class Assignment11_Q3{
        
    public static String strcpy(String str){

       StringBuilder gtr=new StringBuilder();

       for(int i=0;i<str.length();i++){
         
          if(str.charAt(i)>='a' && str.charAt(i)<='z'){
             
               gtr.append(str.charAt(i));

          }
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