import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;


public class StudentTest {
    private Student sue = null;

    @Before
    public void setup() {
        sue = new Student(1, "sue");
        sue.addGrade(77);
        sue.addGrade(80);
        sue.addGrade(30);
    }
    @Test
    public void testId() {
        assertEquals(1, sue.getId());
    }

    @Test
    public void testName() {
        assertEquals("sue", sue.getName());
    }

    @Test
    public void testAddGrade() {
        sue.getGrades().clear();
        sue.addGrade(90);
        assertEquals(1, sue.getGrades().size());
        assertEquals(90, sue.getGrades().get(0).intValue());
    }

    @Test
    public void testGradeAverage() {
        assertEquals(10, sue.getGradeAverage(), 0.01);
    }
    @Test
    public void updateGrade() {
        assertEquals(10, sue.getGradeAverage(), 0.01);
    }
}
