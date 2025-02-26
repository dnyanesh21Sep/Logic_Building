//Program to print 5 to 1 numbers on screen


class Assignment1_Q3{

    public static void Print(int No1){

      while(No1>=1){
          
        System.out.println(No1);
        No1--; 
      }
    }

    public static void main(String[] args) {
        
        Print(5);
    }
}