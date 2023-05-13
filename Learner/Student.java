package Learner;

public class Student extends Person implements Learner {

private double totalStudyTime = 0;


    public Student(String name, long id) {
        super(name, id);
    }


    @Override
    public void learn(double numberOfHours) {
    this.totalStudyTime += numberOfHours;
    }

    @Override
    public double getTotalStudyTime() {
        return totalStudyTime;
    }

}






