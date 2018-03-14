package Java.test;

import Java.main.Weapon;
import org.junit.Test;

import static org.junit.Assert.*;

public class WeaponTest {

    String originalName = "originalName";
    String newName = "newName";

    String originalAction = "originalAction";
    String newAction = "newAction";

    private Weapon testWeapon = new Weapon(originalName, originalAction);

    @Test
    public void testGetName() {
        assertEquals(originalName, testWeapon.getName());
    }

    @Test
    public void testGetAction() {
        assertEquals(originalAction, testWeapon.getAction());

    }

    @Test
    public void testSetName() {
        testWeapon.setName(newName);
        assertEquals(newName, testWeapon.getName());

    }

    @Test
    public void testSetAction() {
        testWeapon.setAction(newAction);
        assertEquals(newAction, testWeapon.getAction());

    }
}
