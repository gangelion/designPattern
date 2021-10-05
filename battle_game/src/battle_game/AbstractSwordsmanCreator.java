package battle_game;

public abstract class AbstractSwordsmanCreator {

  public final Swordsman create() {
	Swordsman swordsman = createSwordsman();
	registerSwordsman(swordsman);
	return swordsman;
  }

  protected abstract Swordsman createSwordsman();
  protected abstract void registerSwordsman(Swordsman swordsman);
}
