    class RunThread implements Runnable{
  public void run(){
    for(int i=1;i<=5;i++){
      System.out.println(i);
      try{
        Thread.sleep(1000);
      }
      catch(Exception e){
        System.out.println(e);
      }
    }
  }
}
class ThreadDemo{
  public static void main(String args[]){
    RunThread t1=new RunThread();
    RunThread t2=new RunThread();
    Thread thread=new Thread(t1);
    Thread thread1=new Thread(t2);
    
    thread.start();
      
    thread1.start();
    
  }
}
