import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Student {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student [age=" + age + ", name=" +name +"]";
    }
}

    public class Main {
    public static void main(String[] args) {
        List<Integer> nums=new ArrayList<Integer>();
        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(2);
        System.out.println(nums.get(2));


        System.out.println(nums.indexOf(2));
        for(Object n:nums)
        {
            int num=(int)n;
            System.out.println(nums);
        }
        System.out.println(Integer.parseInt("789"));
        List<Student> studs= new ArrayList<>();
        studs.add(new Student(21,"Navin"));
        studs.add(new Student(12,"John"));
        studs.add(new Student(18,"Parul"));
        studs.add(new Student(20,"Kiran"));

        System.out.println(studs.get(0).toString());
        Comparator<Student> com=( i,j)->  i.age<j.age?1:-1;
        Collections.sort(studs,com);
        for(Student st: studs) {System.out.println(st.toString());}

         Collection<Integer> collect=new TreeSet<Integer>();
        collect.add(5);
        collect.add(10);
        collect.add(2);
        collect.add(7);
        Iterator<Integer> it=collect.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        Map<String, Integer> students=new Hashtable<>();

        students.put("Navin",56);
        students.put("Harsh",23);
        students.put("Sushil",67);
        students.put("Kiran",92);
        students.put("Harsh",45);

        System.out.println(students.keySet());

        for(String key : students.keySet())
        {
            System.out.println(key + ":" + students.get(key));
        }
        nums.forEach(n-> System.out.println(n));
        List<Integer> arr=Arrays.asList(4,7,6,8,10,15,2);
        System.out.println(arr);
//        arr.add(2); -> cannot be done arrays.as list is fixed size list
//        List<Integer> nums = new ArrayList<>(Arrays.asList(4, 5, 7, 3, 2, 6));
 // to initialise a normal array list
 nums.remove(2);

 //  All the stream API methods
//        filter  → SELECT
//        map     → TRANSFORM
//        sorted  → SORT
//        forEach → DO SOMETHING
//        collect → CONVERT/STORE
//        reduce  → COMBINE
//        count   → COUNT
            arr.stream()
                    .sorted().filter(n->n%2==0).map(n->n*=2).forEach(n->System.out.println(n));
         List<String> name=Arrays.asList("Navin","John","Kishor");
         Optional<String> names=name.stream().filter(str->str.contains("x")).findFirst();
         System.out.println(names);

        // t1.join();
        // "Main thread, wait until this thread finishes."
    }
}