interface A{
    void printF();
}
interface B{
    void printF();
}

class C implements A,B{
   public void printF(){
        System.out.println("Hello from C class.");
    }
}

public class interf {
    public static void main(String[] args) {
        C c = new C();
        c.printF();
        A a;
        a = new C();
        a.printF();
    }
    
}
