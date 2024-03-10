package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

import static org.junit.Assert.assertTrue;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - XCreate tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - XCreate tests for `speak`
    // TODO - XCreate tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - XCreate tests for `Integer getId()`
    // TODO - XCreate test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - XCreate test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void isNewDogtest() {
        String name = "Argyl";
        Date birthDate = new Date (1994, 6, 30);
        Integer id = 356;

        Animal pet = AnimalFactory.createDog(name, birthDate, id);
        assertTrue(pet instanceof Dog);
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
        Mammal pet = new Dog(null, null, null);
        String expected = "bark!";
        String actual = pet.speak();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void dogBirthDateSetTest() {
        String name = null;
        Date birthDate = new Date(2019, 9, 18);
        Integer id = null;

        Mammal pet = AnimalFactory.createDog(name, birthDate, id);
        Assert.assertEquals(birthDate, pet.getBirthDate()); //Check birthDate is set
    }
    @Test
    public void dogGetsNewIdTest() {
        String name = null;
        Date birthDate = null;
        Integer id = 1903;

        Mammal pet = AnimalFactory.createDog(name, birthDate, id);
        Assert.assertEquals(id, pet.getId()); //Check birthDate is set
    }
    @Test
    public void DogIsInstanceOfAnimalTest() {
        String name = null;
        Date birthDate = null;
        Integer id = null;

        Animal pet = AnimalFactory.createDog(name, birthDate, id);
        assertTrue(pet instanceof Animal);
    }
    @Test
    public void DogIsInstanceOfMammalTest() {
        String name = null;
        Date birthDate = null;
        Integer id = null;

        Animal pet = AnimalFactory.createDog(name, birthDate, id);
        assertTrue(pet instanceof Mammal);
    }
}
