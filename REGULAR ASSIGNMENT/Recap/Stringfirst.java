class Stringfirst{
  public static void main(String args[]){
    String word="apple";
    char search='p';
    int index=0;
    char w[]=word.toCharArray();
    for(int i=0;i<w.length;i++){
      if(w[i]==search)
      {
        index=i;
       //break;
      }
        
    }
    System.out.println(index);
    
  }
}