import java.util.Scanner;
class Primenumber{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    int count=0;
    for(int i=1;i<=n/2;i++)
    {
      if(n%i==0)
        count++;
    }
    if(count==1)
      System.out.println("Number is Prime");
    else
      System.out.println("Number is  Not Prime");
  }
}
      