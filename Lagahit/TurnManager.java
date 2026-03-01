public class TurnManager {

    public static void playerTurn(Player player, Enemy enemy, Skill skill) {
        player.attack(enemy);
    }

    public static void enemyTurn(Enemy enemy, Player player) {
        enemy.attack(player);
    }
}