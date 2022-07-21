 /*
 Thera are 4 type Encapsulation
 1. Public
 2. Private
 3. Proteected 
 4. Defult 
 
 */
 
 class person{
    private String name; // private  variable
    private int age;
    private  int id;
    void getData(String name, int age, int id){
        this.name = name;
        this.age = age;
        this. id = id;
      }
    void printData(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(age);
    } 
}

class person2{
    protected String name ="Shakil"; 
    protected int age;
    protected  int id;

}
class person3 extends person2{
       protected String Name;
       person3(){
        System.out.println(super.name);
       }
      
}
class person4 extends person3{
    person4(){
        System.out.println(super.name);
    }
}



public class Encapsulation {
    public static void main(String[] args) {
        // person P1 = new person();
        // P1.getData("Samiya Sultana", 19, 121212);
        // P1.printData();

        person4 P2 = new person4();
        
    }

}
