//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class A
{
    public void show1()
    {
        System.out.println("in A show");
    }
};
class B extends A
{
    public void show2()
    {
        System.out.println("in show B");
    }
};
public class Main {

    public static void main(String[] args) {
System.out.println("hello world");
   // priority JDK -> JRE -> JVM
     // JVM runs the byte code and converts the bytecode into machine understandable instructions
     // JRE contains everything needed to run a java program, it contains JRE and Java libraries and  classes
     // JDK Everything needed to develop and run java programs, contains compiler and debugger etc.
        StringBuilder sb=new StringBuilder("Hello");
        sb.ensureCapacity(10);
        System.out.println(sb.length());
        sb.append("marijuanana");
        sb.insert(4,"kumar");
        System.out.println(sb);
        sb.delete(4,9);
        System.out.println(sb);
        sb.reverse();
		int nums[][]=new int [3][]; //jagged array
		nums[0]=new int [3];
		nums[1]=new int [4];
		nums[2]=new int [2];

        int arr[][]= new int[10][20]; // three dimensional array
        String name=new String("dhruv");
        System.out.println(name);
        System.out.println(name.hashCode());
        System.out.println("hello "+name);
        name.concat("reddy");
        System.out.println(name);
        // immutability

        // The difference between String builder and String buffer is that Builder is synchronized and thread safe
        // A static function in java can't have non static members and functions inside but it can have an object in its parameters

//        new A();   //anonymous object
//        new A().show();
       // a final method in a class cannot be overridden

//
//    	A obj= new A();
//    	 obj=(A) new B();   //upcasting
//    	obj.show1();

        A obj=new B();
        obj.show1();

        B obj1=(B)obj;
        obj1.show1();

        // wrapper class
        int num=5;
        Integer num1=num;
        int num2=num1.intValue();

        System.out.println(num2);

        String s="789";
        System.out.println(Integer.parseInt(s));

    }
}