public class bubbleSort {

    public static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int swap = 0;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }
            }
            if(swap==0){
                break;
            }
        }
    }

    public static void printarr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int arr[] = {5, 4, 1, 3, 2};
        bubbleSort(arr);
        printarr(arr);
//        System.out.println("this is the code of bubble sort");
    }
}
