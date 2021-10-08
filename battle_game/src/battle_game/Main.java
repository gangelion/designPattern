package battle_game;

public class Main {
  public static void main(String[] args) {
    SwordsmanCreator factory = new SwordsmanCreator();
    AbstractPlayer swordsman = factory.create();
    AbstractPlayer monster = new Monster();

    swordsman.receiveDamage(monster.attackPoint);
    System.out.println(swordsman.hp);

    monster.receiveDamage(swordsman.attackPoint);
    System.out.println(monster.hp);
  }
}
