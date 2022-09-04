package day11.task2;

abstract class Hero implements PhysAttack {
    public double phyDef;
    public double magicDef;
    public int health;
    public int physAtt;

    public Hero() {
        this.health = 100;
    }
}




