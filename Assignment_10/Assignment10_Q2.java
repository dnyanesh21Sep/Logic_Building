
import java.util.Scanner;

//Write a program which accept string from user and accept one character. Return frequncy of that character.
class Assignment10_Q2{

    public static int Frequency(String str,char ch){

        int iCount=0;

    
       for(int i=0;i<str.length();i++){
          
            if(str.charAt(i)==ch){
               
               iCount++;

            }
       }

       return iCount;
    }

    public static void main(String[] args) {
        
        String str;
        char ch;
        int iRet=0;

        System.out.println("Enter the String : ");

        Scanner sobj=new Scanner(System.in);
        
        str=sobj.nextLine();

        System.out.println("Enter the Character that you want to check : ");

        ch=sobj.next().charAt(0);

        iRet=Frequency(str, ch);


        System.out.println("Frequency of char "+ch+" in string "+str + " is "+iRet);
    
        sobj.close();
    }
}