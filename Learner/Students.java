package Learner;

public final class Students extends People<Student> {

    private static final Students INSTANCE = new Students();

    private Students() {
        addPerson(new Student("fonza",1));
        addPerson(new Student("jamie",2));
        addPerson(new Student("sebastian",3));
    }

    public static Students getInstance() {
        return INSTANCE;
    }


}
