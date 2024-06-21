public class FindSubArryas {
    public static void printSubaarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
