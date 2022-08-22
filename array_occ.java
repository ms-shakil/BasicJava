public class array_occ {
    public static void main(String[] args) {
        int indx =0,val =0;
		int[] arr ={1,2,2,2,3,4,5,5,6,7,7};
        int[] temp_array = new int [10];
        temp_array[0] =arr[0];
        for(int i =1;i<arr.length;i++){
            
           for(int j =0;j<=val;j++){
               if(temp_array[j]== arr[i]){
                  System.out.println(arr[i]);
               }else{
                   indx+=1;
                   
                   
               }
           }
           val= indx;
        } 

    }
    
}
