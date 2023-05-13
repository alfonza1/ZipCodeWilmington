import Learner.Student;
import org.junit.Test;
import static org.junit.Assert.*;
import Learner.Teacher;
import Learner.Instructor;
import Learner.Person;
public class TestInstructor {

    @Test
    public void testImplementation() {
        Instructor instructor = new Instructor("teach",4);
        assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance() {
        Instructor instructor = new Instructor("teach",4);
        assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach() {
        Instructor instructor = new Instructor("teach",4);
        Student student = new Student("a",1);
        instructor.teach(student, 3);
        assertEquals(3, student.getTotalStudyTime(), 0);
    }

    @Test
    public void testLecture() {
        Instructor instructor = new Instructor("teach",4);
        Student[] students = { new Student("a",1), new Student("b",2), new Student("c",3) };
        instructor.lecture(students, 6);
        assertEquals(2, students[0].getTotalStudyTime(), 0);
        assertEquals(2, students[1].getTotalStudyTime(), 0);
        assertEquals(2, students[2].getTotalStudyTime(), 0);
    }
}
