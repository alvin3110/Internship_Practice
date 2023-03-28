import java.util.*;
class ArrayInsert
  {
    public static void main(String args[])
    {
      int arr[]={10,20,30,40,50};
      int pos=3;
      int value=35;
      int newArr[] = new int [arr.length+1];

      for(int i=0, j=0;i<newArr.length;i++)
        {
          if(i==pos)
          {
            newArr[i]=value;
          }
          else
          {
            newArr[i]=arr[j++];
          }
        }
      System.out.println("orginal array"+Arrays.toString(arr));
      System.out.println("array after insertion"+Arrays.toString(newArr));
      
    }
  }
