
//Missing in Array
class  solution{
    int missingNumber(int arr[]) {
        // code here
        int n=arr.length +1;
        
          long sumExpected = ((long)n * (n + 1)) / 2;
          long sumActual=0;
        
        for(int iSum: arr){
            
            sumActual=sumActual +iSum;
        }
        
        return (int) (sumExpected - sumActual);
    }
}