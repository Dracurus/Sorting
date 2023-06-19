public class QuickSorting {
    public static void quickSort(int[] arr,int left, int right){
        if(left < right){
            int pivotIndex = partition(arr, left, right);
            quickSort(arr,left, pivotIndex -1);
            quickSort(arr, pivotIndex + 1, right);
        }
    }

    public static int partition(int[] arr, int left, int right){
        int pivot = arr[left];
        int i = left + 1;
        for (int j = left+1; j<= right; j++){
            if(arr[j] < pivot){
                swap(arr,i,j);
                i++;
            }
        }
        swap(arr,left,i-1);
        return i-1;
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {7,8,3,1,2};
        int left = 0;
        int right = arr.length -1;
        quickSort(arr,left,right);

        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
