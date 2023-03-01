class StringDeclare{
 
  static void waysTocreate(){
 
    //1 way(to convert char to string)
    char a[]={'a','e','i','o','u'};
    String str=new String(a);
 
    //2nd(literals)
    String str1 =new String("Lalitha");
    
    //3rd way
    String str2="lalitha";
    //display
    System.out.println(str);
    System.out.println(str1);
    System.out.println(str2); 
  }
  public static void main(String args[]){
    waysTocreate();
  }
}