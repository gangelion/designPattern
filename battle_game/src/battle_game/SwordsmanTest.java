package battle_game;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SwordsmanTest {

  private final AbstractPlayer swordsman = new Swordsman();
  private final AbstractEnemy monster = new DevilKing();

  @Test
  void testReceiveDamage() {
    assertEquals(monster.attackPoint, swordsman.receiveDamage(monster.attackPoint));
  }

}
