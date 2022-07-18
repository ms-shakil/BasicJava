class MyClass{
    int x,y,z;
    int add(){
        int sum = x+y+z;
        return sum;
    }

    MyClass(int x,int y,int z){
        this.x =x;
        this.y = y;
        this.z = z;
        
    }
    MyClass(){
        System.out.println("x ="+x);
        System.out.println("y ="+y);
        System.out.println("z ="+z);
    }
}

public class cons_practice {
    public static void main(String[] args) {
        MyClass M1 = new MyClass(10,20,30);
        System.out.println(M1.add());
        MyClass M2 = new MyClass();
        System.out.println(M2.add());
    }
}
