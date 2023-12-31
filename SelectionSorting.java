public class SelectionSorting {
    public static void printArray(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {7,8,3,1,2};

       //selection sort
        for (int i=0; i<arr.length -1; i++){
            int smallest  = i;
            for(int j=i+1; j<arr.length; j++){
                if (arr[smallest] > arr[j]){
                        smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        printArray(arr);
    }
}
