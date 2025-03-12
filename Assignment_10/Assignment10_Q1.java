
import java.util.Scanner;

//Write a program which accept string from user and accept one character.
//Check whether that character is present in string or not.

class Assignment10_Q1{

    public static boolean checkChar(String str,char ch){
    
       for(int i=0;i<str.length();i++){
          
            if(str.charAt(i)==ch){
               
                return true;
            }
       }

       return false;
    }

    public static void main(String[] args) {
        
        String str;
        char ch;
        boolean bRet=false;

        
        System.out.println("Enter the String : ");

        Scanner sobj=new Scanner(System.in);
        
        str=sobj.nextLine();

        System.out.println("Enter the Character that you want to check : ");

        ch=sobj.next().charAt(0);

        bRet=checkChar(str, ch);
        if(bRet==true){

            System.out.println("Character is present in string : ");
        }
        else{
    
            System.out.println("Character is Not present in string : ");
        }

        sobj.close();
    }
}