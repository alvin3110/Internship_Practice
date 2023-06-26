//WAP to find total number of alphabets, digits or special character in a string.
class CountDigAphSpecl{
  public static void main(String args[]){
    String str="Hello !@#$@How Are You";
    int count=0,num=0,cha=0;
    for(int i=0;i<str.length();i++){
      if((str.charAt(i)>='a' && str.charAt(i)<='z') || (str.charAt(i)>='A' && str.charAt(i)<='Z')){
        count++;
      }
      else if((str.charAt(i)>=0 && str.charAt(i)<=9)){
        num++;
      }
      else if(str.charAt(i)=='!' || str.charAt(i)=='@' || str.charAt(i)=='#' || str.charAt(i)=='$' || str.charAt(i)=='%' || str.charAt(i)=='&' || str.charAt(i)==' '){
        cha++;
      }
    }
    System.out.println("The number of letter in the word is: "+count);
    System.out.println("The number of digits in the word is: "+num);
    System.out.println("The number of special characters in the word is: "+cha);
  }
}