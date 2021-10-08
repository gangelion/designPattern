package battle_game;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MonsterTest {

  private final AbstractPlayer monster = new Monster();
  private final AbstractPlayer swordsman = new Swordsman();

  @Test
  void testReceiveDamage() {
    assertEquals(swordsman.attackPoint, monster.receiveDamage(swordsman.attackPoint));
  }

}
