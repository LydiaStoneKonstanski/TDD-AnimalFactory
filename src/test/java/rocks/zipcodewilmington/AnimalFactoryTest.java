package rocks.zipcodewilmington;

import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

import static org.junit.Assert.assertNotNull;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    @Test
    public void createDog_notNull() {
        String name = "Chloe";
        Date birthDate = new Date(2000, 12, 6);
        Integer id = 3503;

        Animal dog = AnimalFactory.createDog(name, birthDate, id);

        assertNotNull(dog);
    }

    //TODO - Create Test for `Animal createCat(String name, Date birthDate)
    @Test
    public void createCat_notNull() {
        String name = "Anastasia";
        Date birthDate = new Date(2014, 7, 15);
        Integer id = 9853;

        Animal cat = AnimalFactory.createCat(name, birthDate, id);

        assertNotNull(cat);
    }
}
