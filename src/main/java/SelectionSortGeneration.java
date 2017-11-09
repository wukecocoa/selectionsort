public class SelectionSortGeneration {

    private SelectionSortGeneration(){}

    private static void swap(Comparable[] arr, int i,int j){
        Comparable temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }

    public static void sort(Comparable[] arr){
        int n=arr.length;
        for (int i = 0; i <n; i++) {
            int minIndex=i;
            for (int j = i+1; j < n; j++) {
                if (arr[j].compareTo(arr[minIndex])<0){
                        minIndex=j;
                }
            }

            swap(arr,i,minIndex);
        }
    }

}

