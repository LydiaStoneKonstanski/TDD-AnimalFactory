package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;

import java.util.Date;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    @Test
    public void createDog_notNull() {
        //Pass in sample name and date
        String name = "Chloe";
        Date birthDate = new Date(2000, 12, 06);

        Animal animal = Animal.createDogTest(name, birthDate);

        assertNotNull(animal); //Check returned animal not null
    }
    @Test
    public void createDog_IsInstanceOfDog() {
        //Pass in sample name and date
        String name = "Gandalf";
        Date birthDate = new Date(1994, 06, 30);

        Animal animal = Animal.createCatTest(name, birthDate);
        assertTrue(animal instanceof Dog); //Check if returned animal instance of Cat
    }
    @Test
    public void createDog_IsNameSet() {
        //Pass in sample name and date
        String name = "Junie";
        Date birthDate = new Date(2003, 02, 14);

        Animal animal = Animal.createCatTest(name, birthDate);
        Assert.assertEquals(name, animal.getName()); //Check name is set
    }
    @Test
    public void createDog_BirthDateIsSet() {
        //Pass in sample name and date
        String name = "Jack";
        Date birthDate = new Date(2019, 09, 18);

        Animal animal = Animal.createDogTest(name, birthDate);
        Assert.assertEquals(birthDate, ((Dog) animal).getBirthDate()); //Check birthDate is set
    }

    //TODO - Create Test for `Animal createCat(String name, Date birthDate)
    @Test
    public void createCat_notNull() {
        //Pass in sample name and date
        String name = "Anastasia";
        Date birthDate = new Date(2014, 07, 15);

        Animal animal = Animal.createCatTest(name, birthDate);

        assertNotNull(animal); //Check returned animal not null
    }
    @Test
    public void createCat_IsInstanceOfCat() {
        //Pass in sample name and date
        String name = "Trail Mix";
        Date birthDate = new Date(1992, 10, 23);

        Animal animal = Animal.createCatTest(name, birthDate);
        assertTrue(animal instanceof Cat); //Check if returned animal instance of Cat
    }
    @Test
    public void createCat_IsNameSet() {
        //Pass in sample name and date
        String name = "Snoops";
        Date birthDate = new Date(1998, 03, 08);

        Animal animal = Animal.createCatTest(name, birthDate);
        Assert.assertEquals(name, animal.getName()); //Check name is set
    }
    @Test
    public void createCat_birthDateIsSet() {
        //Pass in sample name and date
        String name = "Snoops";
        Date birthDate = new Date(1998, 03, 08);

        Animal animal = Animal.createCatTest(name, birthDate);
        Assert.assertEquals(birthDate, ((Cat) animal).getBirthDate()); //Check birth date is set
    }
}
