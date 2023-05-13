package Learner;

import java.util.ArrayList;
import java.util.List;

import java.util.HashMap;
import java.util.Map;

public class ZipCodeWilmington {
    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();
    private final Students students = Students.getInstance();
    private final Instructors instructors = Instructors.getInstance();

    private ZipCodeWilmington() {

    }

    public static ZipCodeWilmington getInstance() {
        return INSTANCE;
    }

    public void hostLecture(Teacher teacher, double numberOfHours) {
        for (Student student : students) {
            teacher.teach(student, numberOfHours / students.count());
        }
    }


    public void hostLecture(long id, double numberOfHours) {
        Instructor instructor = instructors.findById(id);

        if (instructor != null) {
            for (Student student : students) {
                instructor.teach(student, numberOfHours / students.count());
            }
        } else {
            System.out.println("Instructor not found!");
        }
    }




    public Map<Student, Double> getStudyMap() {
        Map<Student, Double> studyMap = new HashMap<>();
        for (Student student : students) {
            studyMap.put(student, student.getTotalStudyTime());
        }
        return studyMap;
    }

}
