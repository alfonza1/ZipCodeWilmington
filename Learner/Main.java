package Learner;

import java.util.Arrays;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

        public class Main {
            public static void main(String[] args) {
                // Add students to the Students singleton
                Students students = Students.getInstance();


                // Add instructors to the Instructors singleton



                // Get the ZipCodeWilmington instance
                ZipCodeWilmington zipCodeWilmington = ZipCodeWilmington.getInstance();

                // Host a lecture with Instructor ID 1 and 4 hours of lecture time
                zipCodeWilmington.hostLecture(4,30);

                // Get the study map after hosting the lecture
                Map<Student, Double> studyMap = zipCodeWilmington.getStudyMap();

                // Print the study map contents
                for (Map.Entry<Student, Double> entry : studyMap.entrySet()) {
                    System.out.println("Student ID: " + entry.getKey().getID());
                    System.out.println("Student Name: " + entry.getKey().getName());
                    System.out.println("Total Study Time: " + entry.getValue());
                    System.out.println("---------------------------");
                }



            }
        }

