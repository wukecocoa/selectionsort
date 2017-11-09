import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
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

    public static void test(String sortClassName,Comparable[] arr) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class clazz=Class.forName(sortClassName);

        Method method=   clazz.getMethod("sort",new Class[]{Comparable[].class});
        Object[] params=new Object[]{arr};
        long starttime=System.currentTimeMillis();

        method.invoke(null,params);
        long endtime=System.currentTimeMillis();

        System.out.println(clazz.getSimpleName()+":"+(endtime-starttime)+"ms");
    }
    public static boolean isSorted(Comparable[] arr){
        int len=arr.length;
        for (int i = 0; i < len-1; i++) {
            if(arr[i].compareTo(arr[i+1])>0){
                return false;
            }
        }
        return true;
    }
}
