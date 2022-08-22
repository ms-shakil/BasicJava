abstract class Abs{
    int a,b;
    Abs(int a,int b){
        this.a = a;
        this.b =b;
    }
    abstract void printArea();
}

class Triangel extends Abs{
    Triangel(int a,int b){
        super(a,b);
    }
    @Override
     void printArea(){
          System.out.println(super.a*super.b);
    }

}
public class abs {
    public static void main(String[] args) {
        Abs as;
        as = new Triangel(4, 5);
        as.printArea();
    }
}
