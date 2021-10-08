package battle_game;

public abstract class AbstractPlayerCreator {

  public final AbstractPlayer create() {
    AbstractPlayer player = createPlayer();
    return player;
  }

  protected abstract AbstractPlayer createPlayer();
}
