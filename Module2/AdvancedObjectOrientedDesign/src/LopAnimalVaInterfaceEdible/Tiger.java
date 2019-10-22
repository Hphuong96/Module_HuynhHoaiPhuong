package LopAnimalVaInterfaceEdible;

public class Tiger extends animal implements Edible {
    @Override
    public String makeSound() {
        return "Tiger: roarrrrrr!";
    }

    @Override
    public String howToEat() {
        return "could be meat";
    }
}
