//Write a program which 2 strings from user and concat seconnd string after first string(Implement strcat() function)
import java.util.Scanner;

class Assignment11_Q4{
        
    public static String strcat(String str,String gtr){

       StringBuilder sstr=new StringBuilder();
       for(int i=0;i<str.length();i++){

          sstr.append(str.charAt(i));

       }
       for(int i=0;i<gtr.length();i++){

          sstr.append(gtr.charAt(i));

       }
       return sstr.toString();

    }
    public static void main(String[] args) {
        
        String str1,str2;
        String SRet;
        // char ch;
        int iRet=0;

        System.out.println("Enter the First String : ");

        Scanner sobj=new Scanner(System.in);
        
        str1=sobj.nextLine();
        System.out.println("Enter the Second  String : ");
        str2=sobj.nextLine();
        SRet=strcat(str1,str2);
        System.out.println("Concatinated  string is "+SRet);
    
        sobj.close();
    }
}