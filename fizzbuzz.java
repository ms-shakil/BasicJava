import java.util.Scanner;;

public class fizzbuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st  number:");
        int a,b, result =0;
        a = sc.nextInt();
        System.out.println("Enter 2nd number:");
        b =sc.nextInt();
        System.out.println("Enter operation: sub or add or mul:");
        String A = sc.next();
       
        if(A =="sub"){
            result= a/b;
            System.out.println(result);
        }else if (A =="add"){
            result = a+b;
            System.out.println(result);
        }else if (A == "mul"){
            result = a*b;
            System.out.println(result);
        }
    }
}