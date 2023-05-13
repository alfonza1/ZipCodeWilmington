import org.junit.Test;


import Learner.Student;
import Learner.People;
import Learner.Students;

import static org.junit.Assert.assertTrue;

public class TestStudents {

    @Test
    public void testGetStudents() {
        Students students = Students.getInstance();

        assertTrue(students.findById(1).getName().equals("fonza"));
        assertTrue(students.findById(2).getName().equals("jamie"));
        assertTrue(students.findById(3).getName().equals("sebastian"));

    }
}

