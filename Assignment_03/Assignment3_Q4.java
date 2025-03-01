
import java.util.Scanner;

// Accept on character from user and check whether that character is vowel(a,e,i,o,u) or not.


class Assignment3_Q4{


    public static boolean  checkVowel(char ch){
         
        boolean bFlag=false;

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
        ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
    {
        bFlag=true;
    }
    else
    {
       bFlag=false;
    }

       return bFlag;

    }
    

    public static void main(String[] args) {

        String str;
        char ch;
        boolean bRet;

        Scanner sobj =new Scanner(System.in);

        System.out.println("Enter the Chracter  : ");

        str=sobj.next();
        ch=str.charAt(0);

        bRet=checkVowel(ch);

        if(bRet==true){

            System.out.println("Given char is Vowel : ");
        }
        else{

            System.out.println("Given char is not  Vowel : ");
        }
       
    }      
}