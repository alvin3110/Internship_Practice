import java.util.Scanner;
class Replace {
  static void Replacechar(String str,char rep,char rep2){
    System.out.println(str.replace(rep, rep2));
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str = sc.next();
    char rep=sc.next();
    char rep2=sc.next();
    Replacechar(str, rep, rep2);
  }
}

