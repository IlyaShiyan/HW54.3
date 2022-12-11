import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Ivan", 101, 1, 4);
        Student student2 = new Student("Liza", 101, 2, 5);
        Student student3 = new Student("Ilya", 101, 3, 3);
        Student student4 = new Student("Anton", 102, 1, 2);
        Student student5 = new Student("Poul", 102, 1, 1);
        Student student6 = new Student("John", 101, 1, 4);
        Student student7 = new Student("Masha", 102, 2, 2);

        List<Student> students = new ArrayList<>(Arrays.asList(student1, student2, student3, student4, student5, student6, student7));

        Iterator<Student> iterator = students.listIterator();
        while (iterator.hasNext()) {
            Student i = iterator.next();
            if (i.getGrades() < 3) {
                iterator.remove();
            } else i.setCourse(i.getCourse()+1);

        }


    }
}
