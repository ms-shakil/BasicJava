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
            for(int j =i;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp =arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            
        }

        int len  = arr.length;
        int Hg = arr[len-1];
        for(int i = len -1;-1<i;i--){
            if(Hg>arr[i]){
            System.out.println("2 nd height value is ="+arr[i]);
            break;
            }
        }
    }
}
