package battle_game;

public abstract class AbstractEnemy {

  public int hp = 100;
  final int attackPoint;

  AbstractEnemy(int attackPoint) {
    this.attackPoint = attackPoint;
  }

  public abstract int receiveDamage(int attackPoint);
}
