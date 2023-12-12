class MyThr1 extends Thread{
    public MyThr1(String name){
        super(name);
    }
    public void run(){
        int i=0;
        while(i<50){
            System.out.println("Thank You: " + this.getName());
            i++;
        }
    }
}
public class rkm_threadPriority {
   public static void main(String[] args) {
    MyThr1 t1 = new MyThr1("Ronat1");
    MyThr1 t2 = new MyThr1("Ronat2");
    MyThr1 t3 = new MyThr1("Ronat3");
    MyThr1 t4 = new MyThr1("Ronat4");
    MyThr1 t5 = new MyThr1("Ronat5");

    t1.setPriority(Thread.MAX_PRIORITY);
     t2.setPriority(Thread.MIN_PRIORITY);
      t3.setPriority(Thread.NORM_PRIORITY);
       t4.setPriority(Thread.MIN_PRIORITY);
        t5.setPriority(Thread.MIN_PRIORITY);
       t1.start(); 
       t2.start(); 
       t3.start(); 
       t4.start(); 
       t5.start(); 
   } 
}
