package day11.task2;

public class Task2 {
    public static void main(String[] args) {
       Warrior warrior = new Warrior();
       Paladin paladin = new Paladin();
       Magician magician = new Magician();
       Shaman shaman = new Shaman();

       warrior.physicalAttack(paladin);
        System.out.println(paladin);

        paladin.physicalAttack(magician);
        System.out.println(magician);

        shaman.healTeammate(magician);
        System.out.println(magician);

        magician.magicalAttack(paladin);
        System.out.println(paladin);
    }
}
