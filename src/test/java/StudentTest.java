import org.junit.Test;

import java.util.ArrayList;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StudentTest {
    @Test
    void testConstructor() {
        Student student = new Student(1, "John Doe");
        assertEquals(1, student.getId());
        assertEquals("John Doe", student.getName());
        assertTrue(student.getGrades().isEmpty());
    }

    @Test
    void testGetId() {
        Student student = new Student(1, "John Doe");
        assertEquals(1, student.getId());
    }

    @Test
    void testGetName() {
        Student student = new Student(1, "John Doe");
        assertEquals("John Doe", student.getName());
    }

    @Test
    void testAddGrade() {
        Student student = new Student(1, "John Doe");
        student.addGrade(90);
        assertEquals(Optional.of(90), student.getGrades().get(0));
    }

    @Test
    void testGetGrades() {
        Student student = new Student(1, "John Doe");
        student.addGrade(90);
        student.addGrade(85);
        ArrayList<Integer> expectedGrades = new ArrayList<>();
        expectedGrades.add(90);
        expectedGrades.add(85);
        assertEquals(expectedGrades, student.getGrades());
    }

    @Test
    void testGetGradeAverage() {
        Student student = new Student(1, "John Doe");
        student.addGrade(90);
        student.addGrade(85);
        assertEquals(87.5, student.getGradeAverage(), 0.01);
    }

}
