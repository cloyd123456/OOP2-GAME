public class Game {

    public static void main(String[] args) {

        Player player = new Player("Hero");
        Enemy enemy = new Enemy("Goblin");

        BattleSystem battle = new BattleSystem(player, enemy);
        battle.startBattle();
    }
}