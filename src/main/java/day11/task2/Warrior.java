package day11.task2;

public class Warrior extends Hero implements PhysAttack{
        public Warrior(){
            physAtt = 30;
            phyDef = 0.8;
            magicDef = 0;
            health = 100;
        }

        @Override
    public String toString() {
        return "Warrior{" +
                "health=" + health +
                '}';
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


