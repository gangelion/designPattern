package battle_game;

public abstract class AbstractPlayer {

  public int hp = 100;
  final int attackPoint;

  AbstractPlayer(int attackPoint) {
    this.attackPoint = attackPoint;
  }

  public abstract int receiveDamage(int attackPoint);
}
