import java.util.*;
class ArrayList{
  public static void main(String args[]){
  //   List list=new ArrayList();
  //   list.add(123);
  //   list.add("nav");
  //   list.add(69.75f);
  //   System.out.println(list);
  //   for( Object obj:list){
  //     System.out.println(obj);
  //   }
  // }

 List list=new ArrayList();
     Scanner sc=new Scanner(System.in);
    list.add(sc.next());
     list.add(sc.next());
     list.add(sc.next());
    System.out.println(list);
    for(Object str:list){
      System.out.println(str);
   }
  
}
