class InvalidAmountException extends Exception{
  InvalidAmountException(String str){
    super(str);
  }
}
 
class ATM{
  int balance=50000;
  void withdraw(int withdrawAmount) throws InvalidAmountException{
    if(withdrawAmount>balance){
      throw new InvalidAmountException("Invalid Amount:Insufficient balance");  
    }
    else if(withdrawAmount%100!=0){
      throw new InvalidAmountException("Invalid Amount:Amount should be multiples of 100");
    }
    else{
      balance=balance-withdrawAmount;
      System.out.println("Success");
    }
    
    
  }
}
 
class AtmException{
public static void main(String args[]){
ATM atm=new ATM();
  try{
    atm.withdraw(10000);
  }
  catch(InvalidAmountException e){
    System.out.println(e);
  }
}
