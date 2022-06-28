import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size:");
        int [] arr = new int[5];
        int a;
        a = sc.nextInt();
        for(int i =0;i<arr.length;i++){
            System.out.println("Enter array element:");
            arr[i] =sc.nextInt();
        }
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
            
        }
        
    }
}
