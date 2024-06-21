
import java.util.HashSet;
import java.util.Set;

public class Course {
    private String id;
    private String title;
    private Set<String> students;

    public Course(String id, String title) {
        this.id = id;
        this.title = title;
        this.students = new HashSet<>();
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Set<String> getStudents() {
        return students;
    }

    public boolean addStudent(String studentId) {
        return students.add(studentId);
    }

    public boolean removeStudent(String studentId) {
        return students.remove(studentId);
    }

    @Override
    public String toString() {
        return "Course{id='" + id + "', title='" + title + "', students=" + students + '}';
    }
}