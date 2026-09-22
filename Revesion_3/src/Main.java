//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
abstract class car{
    public abstract void drive();
    public abstract void  fly();
    public void playMusic(){
        System.out.println("Music Playing");
    }
}
class Jeep extends car{
    // if derived class doesnt completely define the abstract methods of an abstract class then the
    // derived class has to be an abstract class
    @Override
    public void drive() {
        System.out.println("Driving");
    }

    @Override
    public void fly() {
        System.out.println("flying");
    }
}
class Thar extends Jeep{
    public void fingerPrint(){
        System.out.println("finger print detector");
    }
}
class A
{
    int age;

    public void show()
    {
        System.out.println("in show");
    }


   static  class B
    {
        public void config()
        {
            System.out.println("in config");
        }
    }
}
class D
{
    public void show()
    {
        System.out.println("in A show");
    }
}
interface C{
    public int add(int x,int y);
};
class NavinException extends Exception{
public NavinException(String message) {
    super(message);
}
}
public class Main {
    public static void main(String[] args) {
       A.B obj = new A.B();
       obj.config();
//        A.B.config();
        D obj1=new D(){
          public void show(){
              System.out.println("Anonymous show");
          }
        };
        // anymous inner class
        obj1.show();

        // functional interface => have single abstract method
        C ob= ( x,y)->  x+y;

        System.out.println(ob.add(3,5));
        // SAM-> single abstract method
//
//        Error and Exception extends Throwable class.
//        Throwable class is extended by Object class.
//
//        Error is divided into :-
//                1. Thread Death
//        2. Virtual Machine error ( Out of memory)
//        3. IO Error
//
//        Exception is divided into:-
//                1. Runtime Exception  (Unchecked Exception)
//        - Arithmetic
//                - ArrayIndexOutOfBound
//                - Null POinter
//                - It is your choose to handle or not
//
//        2. SQL Exception   (Checked Exception)
//        - It is necessary to handle
//
//        3. IO Exception  (Checked Exception)
//        - It is necessary to handle

        int i=20;
        int j=0;


        try
        {
            j=18/i;
            if(j==0)
//    			throw new Exception("I don't want to do print zero");
                throw new NavinException("I don't want to do print zero");
        }

        catch(ArithmeticException e)
        {
            j=18/i;
            System.out.println("that is default output"+e);

//    		System.out.println("Cannot divide by zero");
        }

        catch(Exception e)
        {

            System.out.println("Something went wrong."+e);
        }

       }
    };
