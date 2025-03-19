import java.util.Scanner;
//Write a program which accept string from user and count white spaces
class  Assignment15_Q1 {


    public static int CountSpace(String str){

        int iCount=0;
        String gtr=str.trim();
        for(int i=0;i<gtr.length();i++){

            if(gtr.charAt(i)==' '){

               iCount++;
            }
        }
        return iCount;
    }
    public static void main(String[] args){

        Scanner sobj = new Scanner(System.in); 

        System.out.print("Enter a string: ");

        String str = sobj.nextLine(); 

        int iRet=CountSpace(str);
        
        System.out.println("Number of spaces in string is "+iRet);

        sobj.close(); 
    }
}
