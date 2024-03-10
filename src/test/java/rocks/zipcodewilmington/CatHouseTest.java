package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
    public void testGetNumberOfCats() {
        CatHouse.clear();
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);

        Integer expectedNoCats = 0;
        Integer expectedOneCat = 1;

        CatHouse.clear();
        Assert.assertEquals(CatHouse.getNumberOfCats(), expectedNoCats);

        // When
        CatHouse.add(animal);

        // Then
        Assert.assertEquals(CatHouse.getNumberOfCats(), expectedOneCat);
    }

    @Test
    public void testRemoveCatById() {
        CatHouse.clear();
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        Integer id = animal.getId();

        Integer expectedNoCats = 0;
        Integer expectedOneCat = 1;

        CatHouse.add(animal);
        Assert.assertEquals(CatHouse.getNumberOfCats(), expectedOneCat);

        CatHouse.remove(id);
        Assert.assertEquals(CatHouse.getNumberOfCats(), expectedNoCats);
    }

    @Test
    public void testRemoveCatByObject() {
        CatHouse.clear();
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);

        Integer expectedNoCats = 0;
        Integer expectedOneCat = 1;

        CatHouse.add(animal);
        Assert.assertEquals(CatHouse.getNumberOfCats(), expectedOneCat);

        CatHouse.remove(animal);
        Assert.assertEquals(CatHouse.getNumberOfCats(), expectedNoCats);
    }


    @Test
    public void testGetCatById() {
        CatHouse.clear();
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        Integer givenId = animal.getId();

        CatHouse.add(animal);

        Cat retrievedCat = CatHouse.getCatById(givenId);

        Assert.assertEquals(retrievedCat.getName(), animal.getName());
        Assert.assertEquals(retrievedCat, animal);
    }



}
