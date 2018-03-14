package Java.test;

import Java.main.Room;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import static org.junit.Assert.*;

public class RoomTest {

    String originalName = "originalName";
    String newName = "newName";

    int originalNumWindows = 5;
    int newNumWindows = 10;

    int originalNumDoors = 1;
    int newNumDoors = 2;

    boolean originalLit = true;
    boolean newLit = false;

    Room testRoom = new Room(originalName, originalNumWindows, originalNumDoors, originalLit);


    @Test
    public void testGetName() {
        assertEquals(originalName, testRoom.getName());
    }

    @Test
    public void testGetNumWindows() {
        assertEquals(originalNumWindows, testRoom.getNumWindows());
    }

    @Test
    public void testGetNumDoors() {
        assertEquals(originalNumDoors, testRoom.getNumDoors());
    }

    @Test
    public void testGetLit() {
        assertEquals(originalLit, testRoom.getLit());
    }

    @Test
    public void testSetName() {
        testRoom.setName(newName);
        assertEquals(newName, testRoom.getName());
    }

    @Test
    public void testSetNumWindows() {
        testRoom.setNumWindows(newNumWindows);
        assertEquals(newNumWindows, testRoom.getNumWindows());
    }

    @Test
    public void testSetNumDoors() {
        testRoom.setNumDoors(newNumDoors);
        assertEquals(newNumDoors, testRoom.getNumDoors());
    }

    @Test
    public void testSetLit() {
        testRoom.setLit(newLit);
        assertEquals(newLit, testRoom.getLit());
    }
}
