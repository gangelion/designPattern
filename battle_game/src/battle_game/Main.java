package battle_game;

public class Main {
  public static void main(String[] args) {
    SwordsmanCreator swordsmanFactory = new SwordsmanCreator();
    AbstractPlayer swordsman = swordsmanFactory.create();
    DevilKingCreator devilKingFactory = new DevilKingCreator();
    AbstractEnemy devilKing = devilKingFactory.create();

    swordsman.receiveDamage(devilKing.attackPoint);
    System.out.println(swordsman.hp);

    devilKing.receiveDamage(swordsman.attackPoint);
    System.out.println(devilKing.hp);
  }
}
