class RunThread implements Runable{
  void run(){
    System.out.println("thread is running");
  }
}
class ThreadDemo1{
  public static void main(String args[]){
    RunThread t = new RunThread();
    Thread thread = new Thread(t);
    thread.start();
  }
}