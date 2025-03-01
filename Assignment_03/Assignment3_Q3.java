
import java.util.Scanner;

//Accept one character from user and convert case of that character

class Assignment3_Q3{


    public static char ChangeCase(char ch){
         

        if(ch>='a' && ch<='z'){

           ch=(char)(ch-32);
        }
        else if(ch>='A' && ch<='Z'){

            ch=(char)(ch+32);
        }

        else{

            System.out.println("invalid input: ");
        }

        return ch;

    }
    

    public static void main(String[] args) {

        String str;
        char ch;
        char iRet;


        Scanner sobj =new Scanner(System.in);

        System.out.println("Enter the Chracter  : ");

        str=sobj.next();
        ch=str.charAt(0);

       iRet=ChangeCase(ch);
       System.out.println("Updated char is "+iRet);

    }      
}