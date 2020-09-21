package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserTest {

    List<Fraction> fractions = new ArrayList<>();

    @Test
    void testGetId(){
        assertEquals("id1", new User("id1", "name", "familyName", fractions).getId());
    }

    @Test
    void testGetName(){
        assertEquals("name", new User("id1", "name", "familyName", fractions).getName());
    }

    @Test
    void testSetName(){
        User user = new User("id1", "name", "familyName", fractions);
        user.setName("updateName");
        assertEquals("updateName", user.getName());
    }

    @Test
    void testGetFamilyName(){
        assertEquals("familyName", new User("id1", "name", "familyName", fractions).getFamilyName());
    }

    @Test
    void testSetFamilyName(){
        User user = new User("id1", "name", "familyName", fractions);
        user.setFamilyName("updateFamilyName");
        assertEquals("updateFamilyName", user.getFamilyName());
    }

    @Test
    void testGetFractions(){
        assertEquals(fractions, new User().getFractions());
    }

    @Test
    void testSetFractions(){
        User user = new User("id1", "name", "familyName", fractions);
        fractions.add(new Fraction(1 ,1));
        user.setFractions(fractions);
        assertEquals(fractions, user.getFractions());
    }

    @Test
    void testAddFraction(){
        User user = new User("id1", "name", "familyName", fractions);
        fractions.add(new Fraction(1 ,1));
        user.addFraction(new Fraction(1,1));
        assertEquals(fractions, user.getFractions());
    }

    @Test
    void testFullName(){
        assertEquals("name familyName", new User("id1", "name", "familyName", fractions).fullName());
    }

    @Test
    void testInitials(){
        assertEquals("n.", new User("id1", "name", "familyName", fractions).initials());
    }

    @Test
    void testToString(){
        User user = new User("id1", "name", "familyName", fractions);
        assertEquals("User{" +
                "id='" + "id1" + '\'' +
                ", name='" + "name" + '\'' +
                ", familyName='" + "familyName" + '\'' +
                ", fractions=" + "[]" +
                '}', user.toString());
    }
}
