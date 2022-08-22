class University{
    String name ;
    String id;
   static String Univ= "UIU";

   University(String n, String i){
    name = n;
    id = i;
   }
   void print(){
    System.out.println(name);
    System.out.println(id);
    System.out.println(Univ);
   }
}
public class Static {
    public static void main(String[] args) {
        University U = new University("shakil","3434");
        University U2 = new University("Dihan", "34343");
        U.print();
        U2.print();
         System.out.println(University.Univ); // static variable call by class name. varibal name

    }
}
