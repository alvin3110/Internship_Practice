import java.util.Scanner;
class ArrayOperations{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Array length");
    int n=sc.nextInt();
    int a[]=new int[n+4];
    System.out.println("Enter Array values");
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
    int p=0,e=0;
    int choice=0;
    while(choice!=9)
    {
      System.out.println("choose operation:");
      System.out.println("1.Insert an element in first index ");
      System.out.println("2.Insert an element in last index ");
      System.out.println("3.Insert an element in specified index ");
      System.out.println("4.Remove element from first index ");
      System.out.println("5.Remove element from last index ");
      System.out.println("6.Remove element from specified index ");
      System.out.println("7.Remove User entered element ");
      System.out.println("8.Arrange ascending or descending ");
      System.out.println("9.Exit");
      choice=sc.nextInt();
      switch(choice)
      {
        case 1:
          p = 0;
          System.out.print("Enter the element which you want to insert:");
          e = sc.nextInt();
          for(int i = n-1; i>=p; i--)
          {
            a[i+1] = a[i];
          }
          a[p] = e;
          System.out.println("After inserting : ");
          for(int i = 0; i<=n; i++)
          {
            System.out.println("a["+i+"]="+a[i]);
          }
          break;
        case 2:
          p = n;
          System.out.print("Enter the element which you want to insert:");
          e = sc.nextInt();
          for(int i = n-1; i>=p; i--)
          {
            a[i+1] = a[i];
          }
          a[p] = e;
          System.out.println("After inserting : ");
          for(int i = 0; i <=n; i++)
          {
            System.out.println("a["+i+"]="+a[i]);
          }
          break;
        case 3:
          System.out.println("Enter index value where element should be inserted:");
          p = sc.nextInt();
          System.out.print("Enter the element which you want to insert:");
          e = sc.nextInt();
          for(int i = n-1; i>=p; i--)
          {
            a[i+1] = a[i];
          }
          a[p] = e;
          System.out.println("After inserting : ");
          for(int i = 0; i <=n; i++)
          {
            System.out.println("a["+i+"]="+a[i]);
          }
          break;
        case 4:
          p=0;
          for(int i=p+1;i<n;i++)
          {
            a[i-1]=a[i];
          }
          System.out.println("After Deleting:");
          for (int i = 0; i < n-1; i++) 
          {
            System.out.println("a["+i+"]="+a[i]);
          }
          break;
        case 5:
          p=n;
          for(int i=p+1;i<n;i++)
          {
            a[i-1]=a[i];
          }
          System.out.println("After Deleting:");
          for (int i = 0; i < n-1; i++) 
          {
            System.out.println("a["+i+"]="+a[i]);
          }
          break;
        case 6:
          System.out.println("Enter index value of element you want to delete:");
          p=sc.nextInt();
          for(int i=p+1;i<n;i++)
          {
            a[i-1]=a[i];
          }
          System.out.println("After Deleting:");
          for (int i = 0; i < n-1; i++) 
          {
            System.out.println("a["+i+"]="+a[i]);
          }
          break;
        case 7:
          System.out.println("Enter Element to search");
          e=sc.nextInt();
          p=0;
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
          break;
        case 8:
          int temp=0;
          System.out.println("1.Ascending\n 2.Descending\n");
          int s=sc.nextInt();
          if(s==1)
          {
            for (int i = 0; i < a.length; i++) 
            {     
              for (int j = i+1; j < a.length; j++) 
              {     
                if(a[i] > a[j]) 
                {    
                  temp = a[i];    
                  a[i] = a[j];    
                  a[j] = temp;    
                }
              }
            }
          }
          else
          {
            for (int i = 0; i < a.length; i++) 
            {     
              for (int j = i+1; j < a.length; j++) 
              {     
                if(a[i] < a[j]) 
                {    
                  temp = a[i];    
                  a[i] = a[j];    
                  a[j] = temp;    
                }
              }
            }
          }
          System.out.println("Elements of array sorted in ascending order: ");    
          for (int i = 0; i < a.length; i++) {     
            System.out.print(a[i] + " ");  
          }
        case 9:
          System.out.println("Bye");
        
        default:System.out.println("Invalid choice select 1-9");
      }
    }
  }
}
    
      
    
    