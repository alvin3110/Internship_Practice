class EHDemo4{
public static void main(String args[]){
System.out.println("gfdgd");
int a[]={1,23,56,78};
  try{
    System.out.println(a[10]);
  }
  catch(ArrayIndexOutOfBoundsException e){
    System.out.println(e);
  }
  for(int i=0;i<4;i++){
    System.out.println(a[i]);
  }
}
}