package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

import static org.junit.Assert.assertTrue;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - XCreate tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - XCreate tests for `speak`
    // TODO - XCreate tests for `setBirthDate(Date birthDate)`
    // TODO - XCreate tests for `Integer getId()`
    // TODO - XCreate test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - XCreate test to check Mammal inheritance; google search `java instanceof keyword`

    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void dogConstructorTest() {
        // Given (dog data)
        String givenName = "Andy";
        Date givenBirthDate = new Date(2003, 6, 16);
        Integer givenId = 7456;

        // When (a dog is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
    @Test
    public void dogSpeaksTest() {
        Dog dog = new Dog(null, null, null);
        String expected = "bark!";
        String actual = dog.speak();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void dogBirthDateSetTest() {
        String name = null;
        Date birthDate = new Date(2019, 9, 18);
        Integer id = null;
        Dog dog = new Dog(name, birthDate, id);
        Assert.assertEquals(birthDate, dog.getBirthDate());
    }
    @Test
    public void dogGetsNewIdTest() {
        String name = null;
        Date birthDate = null;
        Integer id = 1903;

        Dog dog = new Dog(name, birthDate, id);
        Assert.assertEquals(id, dog.getId()); //Check birthDate is set
    }
    @Test
    public void DogIsInstanceOfAnimalTest() {
        String name = null;
        Date birthDate = null;
        Integer id = null;

        Dog dog = new Dog(name, birthDate, id);
        assertTrue(dog instanceof Animal);
    }
    @Test
    public void DogIsInstanceOfMammalTest() {
        String name = null;
        Date birthDate = null;
        Integer id = null;

        Dog dog = new Dog(name, birthDate, id);
        assertTrue(dog instanceof Mammal);
    }
}
