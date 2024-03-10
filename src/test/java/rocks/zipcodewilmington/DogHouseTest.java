package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        DogHouse.clear();
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);

        Integer expectedNoDogs = 0;
        Integer expectedOneDog = 1;

        DogHouse.clear();
        Assert.assertEquals(DogHouse.getNumberOfDogs(), expectedNoDogs);

        // When
        DogHouse.add(animal);

        // Then
        Assert.assertEquals(DogHouse.getNumberOfDogs(), expectedOneDog);
    }

    @Test
    public void testRemoveDogById() {
        DogHouse.clear();
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        Integer id = animal.getId();

        Integer expectedNoDogs = 0;
        Integer expectedOneDog = 1;

        DogHouse.add(animal);
        Assert.assertEquals(DogHouse.getNumberOfDogs(), expectedOneDog);

        DogHouse.remove(id);
        Assert.assertEquals(DogHouse.getNumberOfDogs(), expectedNoDogs);
    }

    @Test
    public void testRemoveDogByObject() {
        DogHouse.clear();
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);

        Integer expectedNoDogs = 0;
        Integer expectedOneDog = 1;

        DogHouse.add(animal);
        Assert.assertEquals(DogHouse.getNumberOfDogs(), expectedOneDog);

        DogHouse.remove(animal);
        Assert.assertEquals(DogHouse.getNumberOfDogs(), expectedNoDogs);
    }


    @Test
    public void testGetDogById() {
        DogHouse.clear();
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        Integer givenId = animal.getId();

        DogHouse.add(animal);

        Dog retrievedDog = DogHouse.getDogById(givenId);

        Assert.assertEquals(retrievedDog.getName(), animal.getName());
        Assert.assertEquals(retrievedDog, animal);
    }

    @Test
    public void sample_Test() {
        DogHouse.clear();
        // This is a general test to get a feel of the overall expected workflow

        System.out.println("Dogs = " + DogHouse.getNumberOfDogs());
        Dog dog = AnimalFactory.createDog("bob", new Date());
        DogHouse.add(dog);
        System.out.println("Dogs = " + DogHouse.getNumberOfDogs());

        for (int i = 0; i < DogHouse.getNumberOfDogs(); i++){
            Dog nextDog = DogHouse.getDogById(i);
            Food meal = new Food();
            nextDog.eat(meal);
        }

        Dog firstDog = DogHouse.getDogById(0);
        System.out.println(firstDog.getName() + " had this many meals: " + firstDog.getNumberOfMealsEaten());
    }
}
