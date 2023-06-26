// WAP to find highest frequency character in a string.
class HighestFrequency{
  public static void main(String args[]){
    String str="Neha,Bitlabs";
    int count=0,max=0;
    char ans=' ';
    for(int i=0;i<str.length();i++){
      for(int j=i+1;j<str.length();j++){
        if(str.charAt(i)==str.charAt(j)){
          count++;
        }
      }
      if(count>max){
          max=count;
          ans=str.charAt(i);
      }
      count=0;
    }
    System.out.println("The highest frequency character is:"+ans);
  }
}