class GrandParent{
    int x=100;
    void m1(){
        System.out.println("GrandParent's m1");
    }

    void grandparentOnly(){
        System.out.println("GrandParent's grandparentOnly");
    }
}

class Parent extends GrandParent{
    int x=200, y, t;
    void m1(){
        System.out.println("Parent's m1");
    }
    void m2(){
        System.out.println("Parent's m2");
    }
    void parentOnly(){
        System.out.println("Parent's parentOnly");
    }
}


class Child extends Parent{
    int x=300, y, z;
    void m1(){
        System.out.println("Child's m1");
    }

    void m2(){
        System.out.println("Child's m2");
    }

    void m3(){
        System.out.println("Child's m3");
    }
}

public class subClassPolymorphism {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.m1(); // sub poyl  nijer functon nibe  and attribute nibe repfrence cls er
        System.out.println(obj.x); 
    }
    
}
