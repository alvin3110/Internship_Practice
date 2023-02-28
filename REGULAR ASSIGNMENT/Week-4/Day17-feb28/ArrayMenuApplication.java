import java.util.Scanner;
class ArrayMenuApplication{
  static void insert(int n, int a[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the array values");
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
  }
  static void insertfirst(int Newelement,int a[],int n){
    Scanner sc=new Scanner(System.in);
    Newelement=sc.nextInt();
    for(int i=n-1;i>=0;i--){
      a[i+1]=a[i];
    }
    a[0]=Newelement;
    n=n++;
  }
   static void insertlast(int Newelement,int a[],int n){
    Scanner sc=new Scanner(System.in);
    Newelement=sc.nextInt();
    for(int i=n-1;i>=n;i--){
      a[i+1]=a[i];
    }
    a[n]=Newelement;
    n=n++;
   }
  static void insertspecific(int Newelement,int a[],int n){
    Scanner sc=new Scanner(System.in);
    Newelement=sc.nextInt();
    System.out.println("Enter position you want to insert");
    int p=sc.nextInt();
    for(int i=n-1;i>=p;i--){
      a[i+1]=a[i];
    }
    a[p]=Newelement;
    n=n++;
  }
  static void deletefirst(int a[],int n){
    for(int i=1;i<n;i++)
    {
      a[i-1]=a[i];
    }
    n=n--;
  }
  static void deletespecific(int a[],int n){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter position you want to insert");
    int p=sc.nextInt();
    for(int i=p+1;i<n;i++)
    {
      a[i-1]=a[i];
    }
    n=n--;
  }
   static void deletelast(int a[],int n){
    a[n-1]=0;
    n=n--;
  }
  static void search(int a[],int e,int n){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Element to search");
    e=sc.nextInt();
    int p=0;
    for(int i=0;i<n;i++)
    {
      if(a[i]==e)
      {
        System.out.println("FOUND "+e+" at"+i+" position");
        p=i;
      }
    }
    if(a[p] != e)
        System.out.println("Not Found");
  }
  static void frequency(int a[], int n){
    boolean visited[] = new boolean[n];
    System.out.println("Value Frequency");
    for(int i=0;i<n;i++)
    {
      if (visited[i] == true)
        continue;
      int p=1;
      for(int j = i + 1; j < n; j++) {
        if (a[i] == a[j]) 
        {
          visited[j] = true;
          p++;
        }
      }
      System.out.println(a[i] + "       " + p);
    }
  }

  
  
  static int[] display(int a[]){
    return a;
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int a[]=new int[50];
    int ch=0;
    int e=0;
    int Newelement=0;
    char c='y';
    int p=0;
    System.out.println("Enter number of Elements you want to insert");
    int n=sc.nextInt();
    do{
      System.out.println("Enter your choice ");
      System.out.println("1.Insert into array");
      System.out.println("2.Insert element to first");
      System.out.println("3.Insert element to last");
      System.out.println("4.Insert element to specific position");
      System.out.println("5.Delete at first");
      System.out.println("6.Delete at last");
      System.out.println("7.Delete at Specific position");
      System.out.println("8.Search");
      System.out.println("9.Frequency of each number");
      System.out.println("10.Display");
      System.out.println("-----Choose between 1-12--------");
      ch=sc.nextInt();
      switch(ch){
        case 1:
          insert(n,a);
          break;
        case 2:
          System.out.println("Enter new element");
          insertfirst(Newelement,a,n);
          break;
        case 3:System.out.println("Enter new element");
          insertlast(Newelement,a,n);
          break;
        case 4:System.out.println("Enter new element");
          insertspecific(Newelement,a,n);
          break;
        case 5:
          deletefirst(a, n);
          break;
        case 6:
          deletelast(a, n);
          break;
        case 7:
          deletespecific(a, n); 
          break;
        case 8:
          search(a, e, n);;
          break;
        case 9:
          frequency(a, n);
          break;
        case 10:
          int d[]=display(a);
           System.out.println("Array Values");
          for(int i=0;i<=n;i++)
            System.out.println("a["+i+"]="+d[i]);
          break;
      }
      System.out.println("Do you want to continue?");
      c=sc.next().charAt(0);
    }while(c!='n');
  }
}