import java.util.Collection;

public class SortTestHelper {

    public static Integer[] generateRandomArray(int len,int rangeL,int rangeR){
         assert rangeL< rangeR;
         Integer[] arr=new Integer[len];
        for (int i = 0; i < len; i++) {
            arr[i]=(int)(Math.random()*rangeR+rangeL);
        }
        return arr;
    }
    public static void  printArray(Object[] arr){
        int len=arr.length;
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static  void printCollection(Collection<?> collection){
        collection.forEach(System.out::println);
    }
}
