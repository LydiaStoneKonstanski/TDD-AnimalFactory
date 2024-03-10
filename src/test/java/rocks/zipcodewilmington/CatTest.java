package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

import static org.junit.Assert.assertTrue;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - XCreate tests for `void setName(String name)`
    // TODO - XCreate tests for `speak`
    // TODO - XCreate tests for `setBirthDate(Date birthDate)`
    // TODO - XCreate tests for `Integer getId()`
    // TODO - XCreate test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - XCreate test to check Mammal inheritance; google search `java instanceof keyword`

    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void catConstructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 3720;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }
    @Test
    public void setNameTest() {
        Cat cat = new Cat(null, null, null);
        String givenName = "Snoops";
        cat.setName(givenName);
        String catName = cat.getName();
        Assert.assertEquals(catName, givenName);
    }
    @Test
    public void testCat_Speaks() {
        Cat cat = new Cat(null, null, null);
        String expected = "meow!";
        String actual = cat.speak();
        Assert.assertEquals(expected, actual);
        }
    @Test
    public void createCat_birthDateIsSet() {
        String name = null;
        Date birthDate = new Date(1998, 3, 8);
        Integer id = null;

        Cat cat = new Cat(name, birthDate, id);
        Assert.assertEquals(birthDate, cat.getBirthDate());
    }
    @Test
    public void catSpeakTest() {
        Cat cat = new Cat(null, null, null);
        String expected = "meow!";
        String actual = cat.speak();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void catGetsNewIdTest() {
        String name = null;
        Date birthDate = null;
        Integer expectedId = 1903;
        Cat cat = new Cat(null, null, expectedId);

        Assert.assertEquals(expectedId, cat.getId());
    }
    @Test
    public void catIsInstanceOfAnimalTest() {
        String name = null;
        Date birthDate = null;
        Integer id = null;
        Cat cat = new Cat(null, null, null);
        assertTrue(cat instanceof Animal);
    }
    @Test
    public void catIsInstanceOfMammalTest() {
        String name = null;
        Date birthDate = null;
        Integer id = null;
        Cat cat = new Cat(null, null, null);
        assertTrue(cat instanceof Mammal);
    }
    @Test
    public void CatEatsFoodTest(){
        Food meal = new Food();
        String name = null;
        Date birthDate = null;
        Integer id = null;
        Integer expectedNumberOfMeals = 1;

        Cat cat = new Cat(name, birthDate, id);
        cat.eat(meal);
        Assert.assertEquals(cat.getNumberOfMealsEaten(), expectedNumberOfMeals);
    }
}
