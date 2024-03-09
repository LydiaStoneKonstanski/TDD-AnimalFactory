package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

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
        Date birthDate = new Date(2000, 12, 6);
        Integer id = 3503;

        Animal pet = AnimalFactory.createDog(name, birthDate, id);

        assertNotNull(pet); //Check returned animal not null

    }
    @Test
    public void createDog_IsInstanceOfDog() {
        //Pass in sample name and date
        String name = "Gandalf";
        Date birthDate = new Date(1994, 6, 30);
        Integer id = 8356;

        Animal pet = AnimalFactory.createDog(name, birthDate, id);
        //Check if returned animal instance of Dog.
        // Could just be assertTrue(true), but for clarity, spelling it out.
        assertTrue(pet instanceof Dog);
    }
    @Test
    public void createDog_IsNameSet() {
        //Pass in sample name and date
        String name = "Hillary";
        Date birthDate = new Date(2003, 2, 14);
        Integer id = 6702;

        Animal pet = AnimalFactory.createDog(name, birthDate, id);
        // The generic Animal does not have a getName method
        // We could either create pet as a Mammal or Dog,
        // or cast the animal to a mammal when using .getName()
        Assert.assertEquals(name, ((Mammal)pet).getName()); //Check name is set
    }
    @Test
    public void createDog_BirthDateIsSet() {
        //Pass in sample name and date
        String name = "Argyle";
        Date birthDate = new Date(2019, 9, 18);
        Integer id = 1903;

        Animal pet = AnimalFactory.createDog(name, birthDate, id);
        Assert.assertEquals(birthDate, ((Mammal) pet).getBirthDate()); //Check birthDate is set
    }

    //TODO - Create Test for `Animal createCat(String name, Date birthDate)
    @Test
    public void createCat_notNull() {
        //Pass in sample name and date
        String name = "Anastasia";
        Date birthDate = new Date(2014, 7, 15);
        Integer id = 9853;

        Animal pet = AnimalFactory.createCat(name, birthDate, id);

        assertNotNull(pet); //Check returned animal not null
    }
    @Test
    public void createCat_IsInstanceOfCat() {
        //Pass in sample name and date
        String name = "Trail Mix";
        Date birthDate = new Date(1992, 10, 23);
        Integer id = 2733;

        Animal pet = AnimalFactory.createCat(name, birthDate, id);
        assertTrue(pet instanceof Cat); //Check if returned animal instance of Cat
    }

}
