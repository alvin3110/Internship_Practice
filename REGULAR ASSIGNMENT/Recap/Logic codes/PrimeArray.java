import java.util.Scanner;
class PrimeArray{
  public static void main(String args[]){
    int arr[]={12,3,2,1,4,5,6,7};
    for(int i=0;i<arr.length;i++){
      int count=0;
      for(int j=1;j<arr[i];j++){
        if(arr[i]%j==0){
          count++;
        }
      }
      if(count==1){
          System.out.println(arr[i]+ " is a prime number");
      }
    }
    
  }
}