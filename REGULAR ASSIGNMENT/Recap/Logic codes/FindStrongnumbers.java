import java.util.Scanner;
class FindStrongnumbers{  
  public static void main(String args[]){    
    Scanner sc=new Scanner(System.in);    
    System.out.println("Enter range :");    
    int s=sc.nextInt();    
    int end=sc.nextInt(); 
    int fact=1;
    for(int i=s;i<=end;i++) { 
      int temp=i;
      int r=0,sum=0;
      while(temp>0)
      {
        r=temp%10;
        fact=1;
        for(int j=1;j<=r;j++){
          fact=fact*j;
        }
        sum=sum+fact;
        temp=temp/10;
      }
      if(sum==i)
        System.out.println(sum);
    }
  }
}