package day11.task2;

public class Paladin extends Hero implements Healer, PhysAttack{
    int healHimself = 25;
    int healTeammate = 10;
    public Paladin(){
        health = 100;
        physAtt = 15;
        phyDef = 0.5;
        magicDef = 0.2;

    }

    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + health +
                '}';
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
        if(hero.health + healHimself > 100){
            hero.health = 100;
        }else{
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
