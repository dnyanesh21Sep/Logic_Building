//Accept one number and check whether it is dividible by 5 or not


import java.util.Scanner;

class Assignment1_Q4{

    public static boolean  Divisible(int No1){
       boolean bFlag=false;

       if(No1%5==0){

        bFlag=true;

       }
       return  bFlag;
    }
    public static void main(String[] args) {
        
        int iValue1=0;
        boolean bRet=false;
       
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the Number: ");
        iValue1=sobj.nextInt();

        bRet=Divisible(iValue1);
        if(bRet==true){

            System.out.println("Number is Divisible by 5 : ");
        }
        else{

            System.out.println("Number is not  Divisible by 5 : ");
        }
    }
}