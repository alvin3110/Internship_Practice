import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
 
class Student_1{
  int rollno;
  String name;
  Student_1(int rollno,String name){
    this.rollno=rollno;
    this.name=name;
  }
}
class MapDemo2{
  public static void main(String args[]){
    LinkedHashMap<Integer,Student_1> map=new LinkedHashMap<Integer,Student_1>();
    Scanner sc=new Scanner(System.in);
    for(int i=1;i<=3;i++){
      map.put(i,new Student_1(sc.nextInt(),sc.next()));
    }
 
    for(Map.Entry m:map.entrySet()){
      Student_1 st=(Student_1)m.getValue(); 
      System.out.println("key is "+m.getKey()+"value is "+m.getValue());
      System.out.println("values are");
      System.out.println(st.rollno+" "+st.name);
      
    }
  }
}
 