package rocks.zipcodewilmington.animals;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class Dog extends Mammal {
    private String name;
    private Date birthDate;
    private Integer id;
    public Dog() {
        super(name, birthDate, id);
        this.name = name;
        this.birthDate = birthDate;
    }

    public String speak() {
        return "bark!";
    }
}
