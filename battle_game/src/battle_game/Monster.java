package battle_game;

public class Monster extends AbstractCharacter {

  Monster() {
    super(10);
    this.hp = super.hp;
  }

  @Override
  public int receiveDamage(int attackPoint) {
    this.hp -= attackPoint;
    return attackPoint;
  }
}
