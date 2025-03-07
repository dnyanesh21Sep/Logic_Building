//WAP that  accepts five integers from the user, stores them in an array, and calculates their sum

import java.util.Scanner;

class Assignment7_Q5{

    public static void main(String[] args) {
        
     int iValue=0,iRet=0;
    
     System.out.println("Enter the size of Array : ");
    
     Scanner sobj=new Scanner(System.in);
    
     iValue=sobj.nextInt();

     Array aobj=new Array(iValue,sobj);
     aobj.Accept();
     iRet=aobj.SumArray();
     
     System.out.print("Sum of the Array is = "+iRet );

     sobj.close();
     
    }
}
class Array{

    private int iSize;
    private int []Arr;
    private Scanner sobj;


   public Array(int iSize,Scanner sobj){
     
      this.iSize=iSize;
      this.sobj=sobj;
      Arr=new int[iSize];
   }
   public void Accept(){
   System.out.println("Enter the Numbers : ");

   for(int i=0;i<iSize;i++){

     Arr[i]=sobj.nextInt();

     }

   }
   public int SumArray(){
    int iSum=0;
       
    for(int i=0;i<iSize;i++){

       iSum=iSum + Arr[i];

      }
      
      return iSum;

   }
}
