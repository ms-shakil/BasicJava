class University{
   final String Name = "United International University."; // thsi varial can't change when use final
   final int free ; // blank final variable
   static final String ucode; // static blank final variable.
   static{
    ucode = "U343U"; // s.b.f.v insialization by static blocks
   }
    
    University(){
        free = 454545; // blank final varibale insilaziton only by constructor
    }

   final void print(){
        System.out.println("hello fnal method");
    }
}

class Student extends University{
    //   void print(){
    //        System.out.println("Hello students methods"); // final method cant' be overwride
    //   }
}
public class Final {
    public static void main(String[] args) {
        Student s = new Student(); // final class can't overwride.
         
    }
}
