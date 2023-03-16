import animalAndInterface.animal.Animal;
import animalAndInterface.animal.Chicken;
import animalAndInterface.animal.Tinger;
import animalAndInterface.fruit.Apple;
import animalAndInterface.fruit.Fruit;
import animalAndInterface.fruit.Orange;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tinger();
        animals[1] = new Chicken();
        for (Animal a : animals) {
            System.out.println(a.makeSounds());
            if (a instanceof Chicken) {
                System.out.println(((((Chicken) a).howToEat())));
            }
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}