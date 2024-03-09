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
    public void Animal createDog(String name, Date birthDate) {
        Dog dog = new Dog(String name, Date birthDate);
        String expectedName = "Max";
        Date expectedDate = 1406692800000;
        Dog newDog = new Dog(expectedName, expectedDate);
        // Then (we expect to get the given name from the dog)
        Assert.assertEquals(newDog.getName(), dog.getName());
    }

    //TODO - Create Test for `Animal createCat(String name, Date birthDate)
    @Test
    public void createCat_notNull() {
        //Pass in sample name and date
        String name = "Anastasia";
        Date birthDate = new Date(2014, 07, 15);

        Animal animal = Animal.createCatTest(name, birthDate);

        assertNotNull(animal); //Check returned animal not null

        Assert.assertEquals(birthDate, ((Cat) animal).getBirthDate()); //Check birth date is set
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
    public void createCat_IsInstanceOfCat() {
        //Pass in sample name and date
        String name = "Snoops";
        Date birthDate = new Date(1998, 03, 08);

        Animal animal = Animal.createCatTest(name, birthDate);
        Assert.assertEquals(birthDate, ((Cat) animal).getBirthDate()); //Check birth date is set
    }
}
