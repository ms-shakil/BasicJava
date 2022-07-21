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
    void printPersonInformation(){
        System.out.println("This is Person class Information.");
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
    void printStudentInformation(){
        System.out.println("This is Student class information Fun.");
    }

}

class NonStudent extends Student{
    NonStudent(){
        System.out.println("This is Non Studnt class Constructor");
    }
    void print_Information(){
        System.out.println("There are No Data.");
        super.printPersonInformation();
    }
    void printNonStudentInformation(){
        System.out.println("This is NonStudent class INformation.");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        NonStudent S = new NonStudent();
        S.print_Information();
        S.printPersonInformation();
        S.printNonStudentInformation();
        Student S2 = new Student();
        S2.print_Information();
    }
}
