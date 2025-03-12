
import java.util.Scanner;

// Write a program which accept string from user and accept one character. Return index of last occurrence of that character.


class Assignment10_Q4{

    public static int LastOccurance(String str,char ch){
        int index=-1;

       for(int i=0;i<str.length();i++){
          
            if(str.charAt(i)==ch){
              
                index=i;

            }
       }

       return index;
       
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

        iRet=LastOccurance(str, ch);
       
        if(iRet>=0){

        System.out.println("In string " +str+" the char "+ch+" is present at index of "+iRet);


        }

        else{

            System.out.println("Character is not present in string  :");

        }
    
        sobj.close();
    }
}