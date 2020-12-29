package Lesson05.HomeWork.AnimalsAll;

import Lesson05.HomeWork.ModelAnimals.Animal;

public class Bird extends Animal {
    public Bird(String ani, int run, double jump, int swimming) {
        super(ani, run, jump, swimming);
    }
    @Override
    public void swimming(){
        System.out.println(ani + " не умеет плавать ");
    }

}
