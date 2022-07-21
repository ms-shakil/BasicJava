class A {
    int x,y,z;
    void sum(){
        System.out.println("This mathods does't works.");
    }
    int sum(int x, int y){ // methods overloging
        return x+y;
    }
    int sum(int x,int y, int z){ // method overloding
        return x+y+z;
    }
}

class B extends A{
    int x,y,z;
    void sum(){ // method overriding
        System.out.println("This methods doen't works !");
    }
}
public class polymorphism {
    public static void main(String[] args) {
        B  b1 = new B();
         b1.sum();
    }
    
}
