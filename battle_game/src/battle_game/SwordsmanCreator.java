package battle_game;

public class SwordsmanCreator extends AbstractPlayerCreator {

  @Override
  protected Swordsman createPlayer() {
    return new Swordsman();
  }

}
