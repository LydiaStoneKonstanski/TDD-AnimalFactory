package rocks.zipcodewilmington;

import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
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
