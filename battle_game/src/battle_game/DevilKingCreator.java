package battle_game;

public class DevilKingCreator extends AbstractEnemyCreator {
  @Override
  protected DevilKing createEnemy() {
    return new DevilKing();
  }
}
