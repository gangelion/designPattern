package battle_game;

public abstract class AbstractCharacter {

  public int hp = 100;
  final int attackPoint;

  AbstractCharacter(int attackPoint) {
    this.attackPoint = attackPoint;
  }

  public abstract int receiveDamage(int attackPoint);
}
