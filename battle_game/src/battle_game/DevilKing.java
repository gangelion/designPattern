package battle_game;

public class DevilKing extends AbstractEnemy {

  DevilKing() {
    super(10);
    this.hp = super.hp;
  }

  @Override
  public int receiveDamage(int attackPoint) {
    this.hp -= attackPoint;
    return attackPoint;
  }
}
