import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class SelectionSortGenerationTest {

    @Test
    public void sort(){
       Double [] darr={1.1,2.4,5.3,2.9,1.1};

       SelectionSortGeneration.sort(darr);

       SortTestHelper.printArray(darr);
       /* for (int i = 0; i <darr.length ; i++) {
            System.out.print(darr[i]+" ");
        }*/
    }


    @Test
    public void sort1(){
        Integer [] arr=SortTestHelper.generateRandomArray(1000000,1,200);
        SelectionSortGeneration.sort(arr);
        SortTestHelper.printArray(arr);
    }
    @Test
    public void sort2(){
        Student[] students=new Student[4];

        students[0]=new Student("B",60);
        students[1]=new Student("C",50);
        students[2]=new Student("E",80);
        students[3]=new Student("A",60);

        SelectionSortGeneration.sort(students);

        SortTestHelper.printArray(students);

       // for (int i = 0; i <students.length ; i++) {
       //     System.out.print(students[i]+" ");
       // }

       List<Student> list= Arrays.asList(students);
       SortTestHelper.printCollection(list);
       //list.forEach(System.out::println);
    }
}
