import static org.junit.Assert.assertEquals;

import Learner.Person;
import org.junit.Test;

public class TestPerson {
    @Test
    public void testConstructor() {
        long id = 123456;
        String name = "John Doe";
        Person person = new Person("John Doe",123456);
        assertEquals(id, person.getID());
        assertEquals(name, person.getName());
    }

    @Test
    public void testSetName() {
        long id = 123456;
        String name = "John Doe";
        Person person = new Person("John Doe",123456);
        String newName = "Jane Doe";
        person.setName(newName);
        assertEquals(newName,person.getName());
    }
}