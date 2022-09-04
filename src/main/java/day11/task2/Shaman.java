package day11.task2;

public class Shaman extends Hero implements MagicAttack, Healer, PhysAttack{
    int healHimself = 50;
    int healTeammate = 30;
    int magicAtt = 15;
    public Shaman(){
        health = 100;
        physAtt = 10;
        phyDef = 0.2;
        magicDef = 0.2;
    }

    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + health +
                '}';
    }

    @Override
    public void magicalAttack(Hero hero) {
            double magicAttackScore = magicAtt *(1 - hero.magicDef);
            if (hero.health - magicDef < 0) {
                hero.health = 0;
            } else {
                hero.health -= magicAtt;
            }
        }

    @Override
    public void healHimself() {
        if (health + healHimself > 100) {
            health = 100;
        } else {
            health = health + healHimself;
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.health + healTeammate > 100) {
            hero.health = 100;
        } else {
            hero.health = hero.health + healTeammate;
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
