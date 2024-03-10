package rocks.zipcodewilmington;

/**
 * @author leon on 4/19/18.
 */
public class Food {
    private String mealType;
    public Food (){
        this.mealType = "Default Meal";
    }
    public void setMealType(String mealType){
        this.mealType = mealType;
    }
    public String getMealType(){
        return this.mealType;
    }
}
