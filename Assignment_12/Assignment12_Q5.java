
import java.util.Scanner;

class Assignment12_Q5{

    public static void subString(String  gtr){


        for(int i=0;i<gtr.length();i++){

            for(int j=i +1;j<=gtr.length();j++){

                System.out.print(gtr.substring(i, j) +" ");

            }
            System.out.println();
        }


    }

    public static void main(String[] args) {

        System.out.println("Enter the string : ");
        Scanner sobj=new Scanner(System.in);

        String str=sobj.nextLine();

        subString(str);

    }
}