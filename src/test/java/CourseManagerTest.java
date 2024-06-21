import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseManagerTest {

    CourseManager manager = new CourseManager();
    @BeforeEach
    void setUp() {
        manager.addCourse("1", "Mathematics");
        manager.addCourse("2", "Physics");

        manager.enrollStudent("1", "student1");
        manager.enrollStudent("2", "student2");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void addCourse() {
        assertTrue(manager.addCourse("3", "languaje"));
    }
    @Test
    void addCourseTest() {
        assertFalse(manager.addCourse("", "Mathematics"));
    }

    @Test
    void addCourseTest1() {
        assertFalse(manager.addCourse("", ""));
    }

    @Test
    void enrollStudent() {
        assertFalse(manager.enrollStudent("3", "student3"));
    }
    @Test
    void enrollStudent1() {
        assertFalse(manager.enrollStudent("1", "student1"));
    }
}