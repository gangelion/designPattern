package battle_game;

public class Character {
  public static void main(String[] args) {
    AbstractCharacter swordsman = new Swordsman();
    AbstractCharacter monster = new Monster();
    swordsman.recieveDamage(monster.attackPoint);
    System.out.println(swordsman.hp);


    monster.recieveDamage(swordsman.attackPoint);
    System.out.println(monster.hp);
  }
}
