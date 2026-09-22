import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//class A extends Thread{
//    public void run(){
//        for(int i=0;i<=100;i++){
//            System.out.println(i);
//        }
//    }
//}
//class B extends Thread{
//    public void run(){
//        for(int i=0;i<=100;i++){
//            System.out.println(i);
//        }
//    }
//}
class A extends Thread{
    public void run(){
        for(int i=0;i<=100;i++){
            System.out.println(i);
            try{
                Thread.sleep(10);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i=0;i<=100;i++){
            System.out.println(i);
        }
    }
}
class C extends Thread{
    public void run(){
        for(int i=0;i<=1000;i++){
            System.out.println(i);
            try{
                Thread.sleep(10);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
class D extends Thread{
    public void run(){
        for(int i=0;i<=1000;i++){
            System.out.println(i);

            try{
                Thread.sleep(10);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
class Counter
{
   public int count;
    //	public void increment()
    public synchronized void increment()
    {
        // synchronized prevents race condition from happening
        count++;
    }
}
public class Main {
    public static void main(String[] args) {

        // Ducking an exception means Instead of handling an exception yourself,
        // you declare it with throws and pass the responsibility to the caller.
//        Scanner sc=new Scanner(System.in);
//        String name=sc.next(); -> input of string
//        String para=sc.nextLine(); -> input of a line of string
//        int num=sc.nextInt();  -> input of integer
//       char c = sc.next().charAt(0)   -> input of character
//        System.out.println("hello");
//
//        Threads:-
//                Multiple threads run at same time in a code.
//               This is known as Multithreading.
//
//                - A thread is a smallest unit to work with. (individual task)
//                - They can run parallely.
//                - Multiple threads can share resources.
//
//        A obj1=new A();
//        obj1.start();
//        B obj2= new B();
//        obj2.start();
//        System.out.println("hello");
//        The JVM/OS scheduler decides when each thread gets CPU time
        // A,B and the maib program are running are concurrently

        A obj1 =new A();
        B obj2= new B();
        obj2.setPriority(Thread.MAX_PRIORITY);
       // If multiple threads are ready/runnable at the same time, the scheduler may give preference to the thread with the higher priority.
        System.out.println(obj1.getPriority());
//        obj1.start();
        try {
            Thread.sleep(10);
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
        // making the main thred sleep for 10 mili seconds
//      obj2.start();

        C obj3= new C();
        D obj4= new D();

//        obj3.start();
//        obj4.start();
        Runnable obj5=()->{
                for(int i=1;i<=5;i++){
                    System.out.println("Hello");
                }
        };
        Runnable obj6=()->{
            for(int i=1;i<=5;i++){
                System.out.println("Hi");
            }
        };
        Thread t1=new Thread(obj5);
        Thread t2=new Thread(obj6);
        t1.start();
        t2.start();
//        - New State
//                - Runnable State  ->  start() method
//                - Running State     -> a thead is running with run() method
//                - Waiting State	    -> sleep(),  wait() method
//                - Dead State
//
//        Through notify(), you will go to waiting state to runnable state.
//        From Running, Runnable state to dead state through stop() method.

        Counter c=new Counter();
        Runnable obj7=()->{
            for(int i=1;i<=10000;i++){
                c.increment();
            }
        };
        Runnable obj8=()->{
            for(int i=1;i<=10000;i++){
             c.increment();
            }
        };
        Thread t3= new Thread(obj7);
        Thread t4= new Thread(obj8);
        t3.start();
        t4.start();
        try {
            Thread.sleep(2000);
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Hello "+ c.count);
    }
}