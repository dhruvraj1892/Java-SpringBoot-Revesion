import java.util.*;
class solve {
    public static boolean check(String s){
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)!=s.charAt(n-1-i)) return false;
        }
        return true;
    }
    public static boolean is_anagrams(String a,String b){
        int arr1[]=new int[26];
        int arr2[]=new int[26];
        for(int i=0;i<a.length();i++){
            char c=a.charAt(i);
            arr1[c-'a']++;
        }
        for(int i=0;i<b.length();i++){
            char c=b.charAt(i);
            arr2[c-'a']++;
        }

        for(int i=0;i<26;i++){
            if(arr1[i]!=arr2[i]) return false;
        }
        return true;
    }
    public static String remove(String s){
        String ans="";
        TreeSet<Character> st=new TreeSet();
        for(int i=0;i<s.length();i++){
            if(!st.contains(s.charAt(i))) {st.add(s.charAt(i));ans+=s.charAt(i);}
            else{
                continue;
            }
        }
        return ans;
    }
}
class Student {
    String name;
    int id;

    Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        Student other = (Student) obj;

        return this.id == other.id &&
                this.name.equals(other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }
};
public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello, World!");
        String s="madam";
        System.out.println(solve.check(s));
        String s1="taco";
        String s2="cato";
        System.out.println(solve.is_anagrams(s1,s2));
        String name="manan";
        System.out.println(solve.remove(name));
        // done and dusted
        int arr[]={2,3,5,6,1};
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        Student s11 = new Student("Dhruv", 101);
        Student s22 = new Student("Dhruv", 101);
        System.out.println(s11.equals(s22));
        System.out.println(s11.hashCode()+" "+s22.hashCode());

    }
}