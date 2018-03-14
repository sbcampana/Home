package Java.test;

import Java.main.House;
import org.junit.Test;

import static org.junit.Assert.*;

public class HouseTest {

    String originalName = "originalName";
    String newName = "newName";

    String originalAddress = "originalAddress";
    String newAddress = "newAddress";

    int originalRoomNumber = 5;
    int newRoomNumber = 4;

    Boolean originalOccupied = true;
    Boolean newOccupied = false;

    House testHouse = new House(originalName, originalAddress, originalRoomNumber, originalOccupied);

    @Test
    public void testGetName() {
        assertEquals(originalName, testHouse.getName());
    }

    @Test
    public void testGetAddress() {
        assertEquals(originalAddress, testHouse.getAddress());
    }

    @Test
    public void testGetNumberOfRooms() {
        assertEquals(originalRoomNumber, testHouse.getNumberOfRooms());
    }

    @Test
    public void testGetOccupied() {
        assertEquals(originalOccupied, testHouse.getOccupied());
    }

    @Test
    public void testSetName() {
        testHouse.setName(newName);
        assertEquals(newName, testHouse.getName());
    }

    @Test
    public void testSetAddress() {
        testHouse.setAddress(newAddress);
        assertEquals(newAddress, testHouse.getAddress());
    }

    @Test
    public void testSetNumberOfRooms() {
        testHouse.setNumberOfRooms(newRoomNumber);
        assertEquals(newRoomNumber, testHouse.getNumberOfRooms());
    }

    @Test
    public void testSetOccupied() {
        testHouse.setOccupied(newOccupied);
        assertEquals(newOccupied, testHouse.getOccupied());
    }
}
