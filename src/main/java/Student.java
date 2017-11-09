public class Student implements  Comparable<Student> {
    private String name;
    private int score;

    public Student(String name,int score){
    this.name=name;
    this.score=score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }


    public int compareTo(Student other) {

        if(this.score==other.score){
            return this.name.compareTo(other.name);
        }

        if(this.score<other.score){
            return -1;
        }else if(this.score>other.score){
            return 1;
        }else {
            return 0;
        }
    }
}
