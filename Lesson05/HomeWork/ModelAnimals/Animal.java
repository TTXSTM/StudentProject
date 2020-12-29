package Lesson05.HomeWork.ModelAnimals;

public class Animal {
    protected String ani;
    protected int run;
    protected double jump;
    protected int swimming;

    public Animal(String ani, int run, double jump, int swimming){
        this.ani = ani;
        this.jump = jump;
        this.run = run;
        this.swimming = swimming;
    }

    public Animal() {
    }

    public void running() {
        System.out.println(ani + " Побежал " + run);
    }
    public void swimming(){
        System.out.println(ani + " Плывёт " + swimming);
    }
    public void jumping(){
        System.out.println(ani + " Прыгнул " + jump);
    }
}
