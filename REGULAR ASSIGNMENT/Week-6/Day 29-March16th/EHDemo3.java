class EHDemo3{
  public static void main(String args[]){
    System.out.println("gfdgd");
   String str="admin@123";
    try{
      int num=Integer.parseInt(str);
    }
    catch(NumberFormatException e){
      System.out.println(e);
    }
    
    System.out.println(str.length());
    
    
  }
}