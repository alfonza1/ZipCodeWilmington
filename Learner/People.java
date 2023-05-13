package Learner;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People<Eperson extends Person> implements Iterable<Eperson> {

    private List<Eperson> personList;

    public People() {
        personList = new ArrayList<>();
    }

    public void addPerson(Eperson person) {
        personList.add(person);
    }

    public Eperson findById(long id) {
        return personList.stream().filter(p -> p.getID() == id).findFirst().orElse(null);
    }

    public boolean contains(Eperson person) {
        return personList.contains(person);
    }

    public void remove(Eperson person) {
        personList.remove(person);
    }

    public void remove(long id) {
        personList.removeIf(p -> p.getID() == id);
    }

    public void removeAll() {
        personList.clear();
    }

    public int count() {
        return personList.size();
    }

    public Eperson[] toArray() {
        return (Eperson[]) personList.toArray(new Person[0]);
    }


    @Override
    public Iterator<Eperson> iterator() {
        return (Iterator<Eperson>) personList.iterator();
    }
}

