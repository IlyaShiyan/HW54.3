import java.util.List;

public class Student {
    private String name;
    private int group;
    private int course;
    private int grades;

    public Student(String name, int group, int course, int grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    @Override
    public String toString(){return String.valueOf(name);
    }

    public String getName() {
        return name;
    }

    public int getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public int getGrades() {
        return grades;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setGrades(int grades) {
        this.grades = grades;
    }

    public void printStudents(List<Student> students, int course){
        for (Student i: students) {
            if (this.course == course)
        System.out.println(name);
        }
    }
}
