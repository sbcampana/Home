package Java.test;

import Java.main.Person;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    String originalName = "originalName";
    String newName = "newName";

    String originalGender = "originalGender";
    String newGender = "newGender";

    int originalAge = 0;
    int newAge = 1;

    int originalLevel = 0;
    int newLevel = 1;

    Person testPerson = new Person(originalName, originalGender, originalAge, originalLevel);

    @Test
    public void testGetName() {
        assertEquals(originalName, testPerson.getName());
    }

    @Test
    public void testGetGender() {
        assertEquals(originalGender, testPerson.getGender());
    }

    @Test
    public void testGetAge() {
        assertEquals(originalAge, testPerson.getAge());
    }

    @Test
    public void testGetLevel() {
        assertEquals(originalLevel, testPerson.getLevel());
    }

    @Test
    public void testSetName() {
        testPerson.setName(newName);
        assertEquals(newName, testPerson.getName());
    }

    @Test
    public void testSetGender() {
        testPerson.setGender(newGender);
        assertEquals(newGender, testPerson.getGender());
    }

    @Test
    public void testSetAge() {
        testPerson.setAge(newAge);
        assertEquals(newAge, testPerson.getAge());
    }

    @Test
    public void testSetLevel() {
        testPerson.setLevel(newLevel);
        assertEquals(newLevel, testPerson.getLevel());
    }


}