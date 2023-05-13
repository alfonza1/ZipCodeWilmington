import Learner.Student;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import Learner.Teacher;
import Learner.Instructor;
import Learner.Person;
import Learner.People;
public class TestPeople {
    @Test
    public void testAdd() {
        People people = new People();

        Person person1 = new Person("alice",1);
        Person person2 = new Person("ally",2);

        people.addPerson(person1);
        people.addPerson(person2);

        Assert.assertEquals(2, people.count());
        Assert.assertTrue(people.contains(person1));
        Assert.assertTrue(people.contains(person2));
    }

    @Test
    public void testRemove() {
        People people = new People();

        Person person1 = new Person("alice",1);
        Person person2 = new Person("alice",1);

        people.addPerson(person1);
        people.addPerson(person2);

        people.remove(person1);

        Assert.assertEquals(1, people.count());
        Assert.assertFalse(people.contains(person1));
        Assert.assertTrue(people.contains(person2));
    }

    @Test
    public void testFindById() {
        People people = new People();

        Person person1 = new Person("alice",1);
        Person person2 = new Person("ally",2);

        people.addPerson(person1);
        people.addPerson(person2);

        Person foundPerson = people.findById(2);

        Assert.assertEquals(person2, foundPerson);
    }
}
