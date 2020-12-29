package Lesson05.HomeWork;


import Lesson05.HomeWork.AnimalsAll.Bird;
import Lesson05.HomeWork.AnimalsAll.Cat;
import Lesson05.HomeWork.AnimalsAll.Dog;
import Lesson05.HomeWork.AnimalsAll.Horse;
import Lesson05.online.models.Hero;

public class main{
    public static void main(String[] args){

        Cat cat = new Cat("Cat", 200, 2, 0);
        Dog dog = new Dog("Dog", 500, 0.5, 10);
        Horse horse = new Horse("Horse", 1500, 3, 100);
        Bird bird = new Bird("Bird", 5, 0.2, 0);

        dog.running();


    }


}
