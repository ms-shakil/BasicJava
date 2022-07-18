class Person{
    String name;
    String id ="111111";
    int age;
    
    Person(){
        System.out.println("This is Person constractor:");
    }
    void print_Information(){
        System.out.println("Name ="+ name);
        System.out.println("Nid ="+ id);
        System.out.println("age ="+age);
    }
    void prac(){
        System.out.println("Hello shakil");
    }
}

class Student extends Person{
    String id ="22222";
    String dep;
    
    Student(){
        System.out.println( "This is student class constructor");
    }
    void print_Information(){
        super.print_Information();
        System.out.println("id ="+ super.id);
        System.out.println("dep ="+dep);
    }

}
public class Inheritance {
    public static void main(String[] args) {
        Student S = new Student();
        S.prac();
        S.print_Information();
        System.out.println(S.id);
    }
}
