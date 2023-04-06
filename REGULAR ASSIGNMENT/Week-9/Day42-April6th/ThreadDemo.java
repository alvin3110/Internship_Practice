class RunThread extends Thread{
  public void run(){
    System.out.println("Thread is running");
  }
}
class ThreadDemo{
  public static void main(String args[]){
    RunThread t1 =new RunThread();
    t1.start();
  }
}