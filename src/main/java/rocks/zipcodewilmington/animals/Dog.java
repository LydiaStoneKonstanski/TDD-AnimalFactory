package rocks.zipcodewilmington.animals;

import rocks.zipcodewilmington.Food;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class Dog extends Mammal {
    private String name;
    private Date birthDate;
    private Integer id;

    public Dog(String name, Date birthDate, Integer id) {

        super(name, birthDate, id);
    }

    public String speak() {

        return "bark!";
    }
    @Override
    public void eat(Food food) {
        super.eat(food);
    }
}
