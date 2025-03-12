
import java.util.Scanner;

//Write a program which accept string from user and accept one character. Return index of first occurrence of that character.

class Assignment10_Q3{

    public static int Frequency(String str,char ch){

       for(int i=0;i<str.length();i++){
          
            if(str.charAt(i)==ch){
               
              return i;
            
            }
       }
       return -1;
       
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
       
        if(iRet>=0){

        System.out.println("In string " +str+" the char "+ch+" is present at index of "+iRet);

        }

        else{

            System.out.println("Character is not present in string  :");

        }
    
        sobj.close();
    }
}