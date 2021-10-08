package battle_game;

public class Swordsman extends AbstractPlayer {

  Swordsman() {
    super(50);
    this.hp = super.hp;
  }

  public int attackPoint = 50;

  @Override
  public int receiveDamage(int attackPoint) {
    this.hp -= attackPoint;
    return attackPoint;
  }
}
