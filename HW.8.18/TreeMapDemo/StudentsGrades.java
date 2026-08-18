import java.util.TreeMap;
import java.util.Collections;

public class StudentsGrades {
    public static void main(String[] args) {
        TreeMap<String, Double> students = new TreeMap<>();
        students.put("Davit", 4.0);
        students.put("Avet", 5.0);
        students.put("Ashot", 2.0);
        students.put("Michael", 4.5);
        students.put("Aghas", 3.4);

        System.out.println("students in alphabetical order:");
        for (String name : students.keySet()) {
            System.out.println(name + ": " + students.get(name));
        }
        double highestGrade = Collections.max(students.values());
        System.out.println("highest grade:" + highestGrade);

        for (String name : students.keySet()) {
            if (students.get(name) == highestGrade) {
                System.out.println("top student: " + name);
                System.out.println("top student: " + name);
            }
    }
}
    }
