package Learner;

public class Instructors extends People<Instructor>{

    private static final Instructors INSTANCE = new Instructors();



    private Instructors() {
        addPerson(new Instructor("mikaila",4));
        addPerson(new Instructor("fonza",5));

    }

    public static Instructors getInstance() {
        return INSTANCE;
    }



}
