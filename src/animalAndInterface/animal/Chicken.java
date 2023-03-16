package animalAndInterface.animal;

import animalAndInterface.edible.IEdible;

public class Chicken extends Animal implements IEdible {

    @Override
    public String makeSounds() {
        return null;
    }

    @Override
    public String howToEat() {
        return null;
    }
}
