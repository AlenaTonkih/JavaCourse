package day11.task2;

public class Magician extends Hero implements MagicAttack, PhysAttack {
    int magicAtt = 20;

    public Magician() {
        health = 100;
        physAtt = 15;
        phyDef = 0;
        magicDef = 0.8;
    }

    @Override
    public String toString() {
        return "Magician{" +
                "health=" + health +
                '}';
    }

    @Override
    public void magicalAttack(Hero hero) {
        double magicAttackScore = magicAtt * (1 - hero.magicDef);
        if (hero.health - magicDef < 0) {
            hero.health = 0;
        } else {
            hero.health -= magicAtt;
        }
    }


    @Override
    public void physicalAttack(Hero hero) {
        double attackScore = hero.health - (physAtt * hero.phyDef);
        if (hero.health - physAtt < 0) {
            hero.health = 0;
        } else {
            hero.health -= physAtt;
        }
    }
}
