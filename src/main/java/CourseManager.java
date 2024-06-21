
import java.util.*;

public class CourseManager {
    private Map<String, Course> courses = new HashMap<>();

    public boolean addCourse(String id, String title) {
        if (courses.containsKey(id) || id.isEmpty() || title.isEmpty()) {
            return false;
        }
        courses.put(id, new Course(id, title));
        return true;
    }

    public boolean deleteCourse(String id) {
        return courses.remove(id) != null;
    }

    public boolean enrollStudent(String courseId, String studentId) {
        Course course = courses.get(courseId);
        if (course == null) {
            return false;
        }
        return course.addStudent(studentId);
    }

    public boolean unenrollStudent(String courseId, String studentId) {
        Course course = courses.get(courseId);
        if (course == null) {
            return false;
        }
        return course.removeStudent(studentId);
    }

    public List<Course> listCourses() {
        return new ArrayList<>(courses.values());
    }

    public static void main(String[] args) {
        CourseManager manager = new CourseManager();

        manager.addCourse("1", "Mathematics");
        manager.addCourse("2", "Physics");

        manager.enrollStudent("1", "student1");
        manager.enrollStudent("2", "student2");

        System.out.println("All courses: " + manager.listCourses());
    }
}
