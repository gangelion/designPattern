package battle_game;

public class SwordsmanCreator extends AbstractSwordsmanCreator {

  @Override
  protected Swordsman createSwordsman() {
	return new Swordsman();
  }

  @Override
  protected void registerSwordsman(Swordsman swordsman) {

  }
}
