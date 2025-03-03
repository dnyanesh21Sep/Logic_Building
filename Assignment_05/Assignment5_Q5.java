
import java.util.Scanner;

//Accept the Number of Elements from user Store it in to Array And Count the Number of Odd Numbers : 

class  Assignment5_Q5{

    public static void main(String[] args) {

        
        int iValue=0;
        


        Scanner sobj =new Scanner(System.in);

        System.out.println("Enter the  Size of Array : ");

        iValue=sobj.nextInt();

        Array aobj=new Array(iValue);

        aobj.Accept();
       int []count=aobj.countEvenOdd();
       System.out.println("Number Even Numbers in  the Array  is "+count[0]);
       System.out.println("Number Odd Numbers in  the Array  is "+count[1]);

    }
}

class Array{

    public int size;
    public int Arr[];

    Array(int iSize){

        this.size=iSize;
        this.Arr=new int[size];
    }


    public void Accept(){

        Scanner sobj=new Scanner(System.in);


        System.out.println("Enter the Numbers : ");

        for(int i=0;i<size;i++){
          
            Arr[i]=sobj.nextInt();
            
        }
    }

    public int[] countEvenOdd() {
        int countEven = 0, countOdd = 0;

        for (int num : Arr) {
            if (num % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        return new int[]{countEven, countOdd};
}
}

