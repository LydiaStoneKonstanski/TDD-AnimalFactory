package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - XCreate tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - X Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
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
    public void createCat_IsNameSet() {
        //Pass in sample name and date
        String startName = "Snoops";
        String newName = "Snoopums";
        Date birthDate = new Date(1998, 3, 8);
        Integer id = 9780;


        Animal pet = new Cat(startName, birthDate, id);

        // .setName should change the name that was given in the original constructor
        // use .getName to confirm that it was successfully set
        ((Mammal)pet).setName(newName);
        Assert.assertEquals(newName, ((Mammal)pet).getName()); //Check name is set
    }
    @Test
    public void createCat_birthDateIsSet() {
        //Pass in sample name and date
        String name = "Bria";
        Date birthDate = new Date(1998, 3, 8);
        Integer id = 5043;

        Animal pet = new Cat(name, birthDate, id);
        Assert.assertEquals(birthDate, ((Mammal) pet).getBirthDate()); //Check birthDate is set
    }

}
