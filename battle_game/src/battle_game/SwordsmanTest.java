package battle_game;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SwordsmanTest {

	private final AbstractCharacter swordsman = new Swordsman();
	private final AbstractCharacter monster = new Monster();

	@Test
	void testReceiveDamage() {
		assertEquals(monster.attackPoint, swordsman.receiveDamage(monster.attackPoint));
	}

}
