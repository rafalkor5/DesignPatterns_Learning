package Flyweigth;

import Flyweigth.UnitStats.UnitStats;

abstract public class Unit {
    private int hp;
    private int x;
    private int y;


    protected Unit(int hp, int x, int ys) {
        this.hp = hp;
        this.x = x;
        this.y = y;

    }

    public int getHp() {
        return hp;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
}
