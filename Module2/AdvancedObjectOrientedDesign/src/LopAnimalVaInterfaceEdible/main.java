package LopAnimalVaInterfaceEdible;
public class main {

    public static void main(String[] args) {
        animal[] animals = new animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (animal animal : animals){
            System.out.println(animal.makeSound());
            if (animal instanceof  Tiger){
                Edible edible = (Tiger) animal;
                System.out.println(edible.howToEat());
            }
            if (animal instanceof Chicken){
                Edible edible = (Chicken) animal;
                System.out.println(edible.howToEat());
            }
        }
        fruit[] fruits = new fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (fruit fruit : fruits){
            System.out.println(fruit.howToEat());
        }
    }
}
