import org.junit.Test;
import java.util.Map;
import Learner.Instructors;
import Learner.ZipCodeWilmington;
import Learner.Instructor;
import Learner.Students;
import Learner.Student;
import static org.junit.Assert.assertEquals;

public class TestZipCodeWilmington {
    @Test
    public void testHostLecture() {
        ZipCodeWilmington zipCodeWilmington = ZipCodeWilmington.getInstance();
        Students students = Students.getInstance();
        Instructors instructors = Instructors.getInstance();

        // Assuming there are students and instructors added in the singleton instances
        Instructor instructor = instructors.findById(4); // Assuming an instructor with id 4 exists
        double numberOfHours = 10;

        zipCodeWilmington.hostLecture(instructor, numberOfHours);

        Map<Student, Double> studyMap = zipCodeWilmington.getStudyMap();
        double expectedHoursPerStudent = numberOfHours / students.count();
        for (Map.Entry<Student, Double> entry : studyMap.entrySet()) {
            assertEquals(expectedHoursPerStudent, entry.getValue(), 1e-9);
        }
    }
}


