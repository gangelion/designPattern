package battle_game;

public abstract class AbstractEnemyCreator {

  public final AbstractEnemy create() {
	AbstractEnemy enemy = createEnemy();
	return enemy;
  }

  protected abstract AbstractEnemy createEnemy();
}
