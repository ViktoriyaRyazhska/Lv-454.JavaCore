public class Sort {
        public static void main(String[] args) {
        int[] arr = {2,-5,7,-4,8};
        int a;
        for(int i = 0;i< arr.length-1;i ++){
           for (int j= i+1;j< arr.length;j++){
               if ( arr [i] < arr[j]){
                  a =  arr[i];
                   arr[i]= arr[j];
                   arr[j]= a;
               }
           }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}





