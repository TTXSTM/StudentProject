package Lesson05.online.heros;

import Lesson05.online.models.Hero;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date of creation: 24.12.2020
 */

public class Paladin extends Hero {

    int dex;

    public Paladin(String name, int hp, int mp, int atk) {
       super(name, hp, mp, atk);
       this.dex = 0;
    }

    public Paladin(String name, int hp, int mp, int atk, int dex) {
        super(name, hp, mp, atk);
        this.dex = dex;
    }

    @Override
    public void heal(int hp) {
        System.out.println(name + " has heal self to " + (hp + 10));
    }

}
