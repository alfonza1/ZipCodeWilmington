
import static org.junit.Assert.assertEquals;
import Learner.Learner;
import Learner.Person;
import org.junit.Test;
import Learner.Student;
import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testImplementation() {
        Student student = new Student("alfonza",5555);
        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritance() {
        Student student = new Student("alfonza",5555);
        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void testLearn() {
        double initialStudyTime = 0;
        double numberOfHours = 5;
        Student student = new Student("alfonza",5555);
        Assert.assertEquals(initialStudyTime, student.getTotalStudyTime(), 5.0);
        student.learn(numberOfHours);
        Assert.assertEquals(numberOfHours, student.getTotalStudyTime(), 10.0);
    }




}
