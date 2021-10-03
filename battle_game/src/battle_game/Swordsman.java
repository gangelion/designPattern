package battle_game;

public class Swordsman extends AbstractCharacter {

  Swordsman() {
    super(50);
	this.hp = super.hp;
  }

  public int attackPoint = 50;

  @Override
  public int recieveDamage(int attackPoint) {
    this.hp -= attackPoint;
	return this.hp;
  };
}
