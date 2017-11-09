import org.junit.Test;

public class SelectionSortTest {

    @Test
    public void sort(){
        int arr[]={10,8,9,11,6,4,3,2,68};
        SelectionSort.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }

    public void sort2(){

    }
}
