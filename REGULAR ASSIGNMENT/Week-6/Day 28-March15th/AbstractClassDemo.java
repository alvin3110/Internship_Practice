abstract class Bank{
   int getInterestRate(String typeofAccount){
     if(typeofAccount.equals("saving")){
       return 5;
     }
     else{
       return 7;
     }
   }
   abstract void calculateInterest(int amount);
}
class SavingAccount extends Bank
{
  void calculateInterest(int amount){
    int interest=(amount*getInterestRate("saving"))/100;
    System.out.println(interest);
    
  }
  
}
class FixedDeposit extends Bank{
  void calculateInterest(int amount){
    int interest=(amount*getInterestRate("fixed"))/100;
    System.out.println(interest);
    
  }
}
 
class AbstractClassDemo{
  public static void main(String args[]){
   Bank saccount=new SavingAccount();
    saccount.calculateInterest(10000);
 
    Bank faccount=new FixedDeposit();
    faccount.calculateInterest(10000);
  }
}