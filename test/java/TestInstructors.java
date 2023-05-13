import Learner.Students;
import org.junit.Test;
import Learner.Instructors;
import static org.junit.Assert.assertTrue;

public class TestInstructors {



    @Test
    public void testGetStudents() {
        Instructors instructors = Instructors.getInstance();

        assertTrue(instructors.findById(4).getName().equals("mikaila"));
        assertTrue(instructors.findById(5).getName().equals("fonza"));


    }






}
