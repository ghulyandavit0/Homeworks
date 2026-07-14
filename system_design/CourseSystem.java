package system_design;
import java.util.ArrayList;
import java.util.List;

class Student{
    private String name;
    private int id;

    /**
     * student constructor
     * @param name student's name
     * @param id student's id
     */
    public Student(String name, int id){
        this.name = name;
        this.id = id;
    }

    /**
     * name getter
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * id getter
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * enrolls the student into a course
     * @param course the course to be enrolled
     */
    public void enroll(Course course) {
        course.addStudent(this);
    }
}
class Course {
    private String courseName;
    private int capacity;
    private boolean newId;
    private List<Student> enrolledStudents = new ArrayList<>();

    public Course(String courseName, int capacity, boolean newId) {
        this.courseName = courseName;
        this.capacity = capacity;
        this.newId = newId;
    }

    public void addStudent(Student student) {
        if (enrolledStudents.size() >= capacity) {
            System.out.println(student.getName() + " is not enrolled in " + courseName + " because it is full");
            return;
        }
        if (newId) {
            for (Student s : enrolledStudents) {
                if (s.getId() == student.getId()) {
                    System.out.println(student.getName() + " not enrolled in " + courseName + "because duplicate id " + student.getId());
                    return;
                }
            }
        }
        enrolledStudents.add(student);
        System.out.println(student.getName() + " enrolled in " + courseName);
    }
    public void printCourseMembers() {
        System.out.println(courseName + " course members : ");
        for (Student s : enrolledStudents) {
            System.out.println(s.getName() + " id = " + s.getId());
        }

    }
}

public class CourseSystem {
    public static void main(String[] args) {

        Student a1 = new Student("Anna", 101);
        Student a2 = new Student("Levon", 102);
        Student a3 = new Student("Mariam", 103);
        Student a4 = new Student("Davit", 101);
        Student a5 = new Student("Narek", 105);
        Student a6 = new Student("Vahan", 106);

        Course math = new Course("Math", 10, false);
        Course physics = new Course("Physics", 10, false);

        Student[] students = {a1, a2, a3, a4, a5, a6};
        for (Student s : students) s.enroll(math);
        for (Student s : students) s.enroll(physics);

        System.out.println();
        math.printCourseMembers();
        physics.printCourseMembers();
    }
}
