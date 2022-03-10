package FactoryPackage.AbstractMethod.Factory;
public abstract class InfantryUnit extends Unit {

    private int hp;
    private int exp;
    private int damage;
    private Flag flag;

    protected InfantryUnit(int hp, int exp, int damage, Flag flag) {
        this.hp = hp;
        this.exp = exp;
        this.damage = damage;
        this.flag = flag;
    }

    //@Getter
    public int getHp() {
        return hp;
    }
    public int getExp() {
        return exp;
    }
    public int getDamage() {
        return damage;
    }

    @Override
    public String toString() {
        return "InfantryUnit{" +
                "hp=" + hp +
                ", exp=" + exp +
                ", damage=" + damage +
                ", flag=" + flag +
                '}';
    }
}
