class Myclass{
    void display(){
        System.out.println("Hello from my class.");
    }
}
public class AnonymousClass {
 public static void main(String[] args) {
    MyClass my = new MyClass(){
        @Override
        void display(){
            System.out.println("Hello from my class.");
        }
    };
    my.display();

 }   
}
